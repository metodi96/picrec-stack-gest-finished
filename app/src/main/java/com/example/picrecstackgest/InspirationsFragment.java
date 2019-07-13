package com.example.picrecstackgest;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import com.wenchao.cardstack.CardStack;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static android.content.Context.SENSOR_SERVICE;


public class InspirationsFragment extends Fragment implements SensorEventListener {
    private HashMap<String, Integer> rolesToPoints = new HashMap<String, Integer>() {{
        put("actionseek1", 0);
        put("active1", 0);
        put("anthro2", 0);
        put("arch1",0);
        put("classy1",0);
        put("drifter2",0);
        put("educational1",0);
        put("escapist1",0);
        put("escapisttwo2", 0);
        put("explorer2", 0);
        put("independent1", 0);
        put("independenttwo1", 0);
        put("organized1", 0);
        put("seeker1", 0);
        put("sun1", 0);
        put("thrill2", 0);
    }};
    ProfileFragment profileFragment = MainActivity.profileFragment;
    private CardStack cardStack;
    private CardAdapter cardAdapter;
    private int counter = 0;
    private ArrayList<Integer> points = new ArrayList<>();
    private Sensor sensor;
    private SensorManager sensorManager;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View v = inflater.inflate(R.layout.fragment_inspirations, container, false);
            addInspirations();
            cardStack = v.findViewById(R.id.card_stack);
            cardStack.setContentResource(R.layout.pictures_inspirations);
            cardStack.setAdapter(cardAdapter);
            ImageButton dislike = v.findViewById(R.id.dislike);
            dislike.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    cardStack.discardTop(2);
                    counter++;
                    points.add(0);
                    savePoints(counter);
                }
            });
        ImageButton like = v.findViewById(R.id.like);
        like.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardStack.discardTop(3);
                counter++;
                points.add(1);
                savePoints(counter);
            }
        });

        ImageButton reset = v.findViewById(R.id.reset);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (counter > 0) {
                    cardStack.reset(true);
                    points.removeAll(points);
                    counter=0;
                    savePoints(counter);
                }
            }
        });

            cardStack.setListener(new CardStack.CardEventListener() {
                @Override
                public boolean swipeEnd(int i, float v) {
                        switch (i) {
                            case 0:
                                return false;
                            case 1:
                                return false;
                            case 2:
                                return false;
                            case 3:
                                return false;
                        }
                   return v > 300;
                }

                @Override
                public boolean swipeStart(int i, float v) {
                    return false;
                }

                @Override
                public boolean swipeContinue(int i, float v, float v1) {
                    return false;
                }

                @Override
                public void discarded(int i, int i1) {

                }

                @Override
                public void topCardTapped() {

                }
            });
            sensorManager = (SensorManager) getActivity().getSystemService(SENSOR_SERVICE);
            sensor = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
            sensorManager.registerListener(this, sensor, SensorManager.SENSOR_DELAY_NORMAL);

        return v;
    }


    private void addInspirations() {
        cardAdapter = new CardAdapter(getContext(), 0);
        for (String role : rolesToPoints.keySet()) {
            int roleId = getResources().getIdentifier(role,"drawable", getActivity().getPackageName());
            cardAdapter.add(roleId);
        }
    }

    public void savePoints(int counter) {
        if(counter >= rolesToPoints.size()) {
            modifyHashmap(rolesToPoints, points);
            Bundle bundle = new Bundle();
            bundle.putSerializable("rolesToPoints", rolesToPoints);
            profileFragment.setArguments(bundle);
            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, profileFragment).commit();
        }
    }

    public HashMap<String, Integer> modifyHashmap(HashMap<String, Integer> hashMap, ArrayList<Integer> arrayList) {
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            entry.setValue(arrayList.remove(0));
        }
        return hashMap;
    }

    private int countSensorData = 0;
    @Override
    public void onSensorChanged(SensorEvent event) {
        float x = event.values[0];
        countSensorData++;
           if (x < -5 && counter < rolesToPoints.size() && countSensorData%10 == 0) {
               cardStack.discardTop(3);
               counter++;
               points.add(1);
               savePoints(counter);
           }

            if (x > 5 && counter < rolesToPoints.size() && countSensorData%10 == 0) {
                cardStack.discardTop(2);
                counter++;
                points.add(0);
                savePoints(counter);
            }
       }
    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}
