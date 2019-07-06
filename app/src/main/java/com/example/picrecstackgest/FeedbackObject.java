package com.example.picrecstackgest;

class FeedbackObject {
    private String gender;
    private String ageGroup;
    private String recommendersUsed;
    private String attractiveImages;
    private String generatedProfileMatchesChoices;
    private String tiltingEnjoyment;
    private String preferTilting;
    private String preferSwipingOverTilting;
    private String easyToTellLikeDislike;
    private String attractiveLayout;
    private String adequateLayout;
    private String quicklyFamiliarWithRecommender;
    private String inControl;
    private String satisfaction;
    private String futureUse;

    public FeedbackObject(String gender, String ageGroup, String recommendersUsed, String attractiveImages, String generatedProfileMatchesChoices, String tiltingEnjoyment, String preferTilting, String preferSwipingOverTilting, String easyToTellLikeDislike, String attractiveLayout, String adequateLayout, String quicklyFamiliarWithRecommender, String inControl, String satisfaction, String futureUse) {
        this.gender = gender;
        this.ageGroup = ageGroup;
        this.recommendersUsed = recommendersUsed;
        this.attractiveImages = attractiveImages;
        this.generatedProfileMatchesChoices = generatedProfileMatchesChoices;
        this.tiltingEnjoyment = tiltingEnjoyment;
        this.preferTilting = preferTilting;
        this.preferSwipingOverTilting = preferSwipingOverTilting;
        this.easyToTellLikeDislike = easyToTellLikeDislike;
        this.attractiveLayout = attractiveLayout;
        this.adequateLayout = adequateLayout;
        this.quicklyFamiliarWithRecommender = quicklyFamiliarWithRecommender;
        this.inControl = inControl;
        this.satisfaction = satisfaction;
        this.futureUse = futureUse;
    }

    public String getPreferTilting() {
        return preferTilting;
    }

    public void setPreferTilting(String preferTilting) {
        this.preferTilting = preferTilting;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(String ageGroup) {
        this.ageGroup = ageGroup;
    }

    public String getRecommendersUsed() {
        return recommendersUsed;
    }

    public void setRecommendersUsed(String recommendersUsed) {
        this.recommendersUsed = recommendersUsed;
    }

    public String getAttractiveImages() {
        return attractiveImages;
    }

    public void setAttractiveImages(String attractiveImages) {
        this.attractiveImages = attractiveImages;
    }

    public String getGeneratedProfileMatchesChoices() {
        return generatedProfileMatchesChoices;
    }

    public void setGeneratedProfileMatchesChoices(String generatedProfileMatchesChoices) {
        this.generatedProfileMatchesChoices = generatedProfileMatchesChoices;
    }

    public String getTiltingEnjoyment() {
        return tiltingEnjoyment;
    }

    public void setTiltingEnjoyment(String tiltingEnjoyment) {
        this.tiltingEnjoyment = tiltingEnjoyment;
    }

    public String getPreferSwipingOverTilting() {
        return preferSwipingOverTilting;
    }

    public void setPreferSwipingOverTilting(String preferSwipingOverTilting) {
        this.preferSwipingOverTilting = preferSwipingOverTilting;
    }

    public String getEasyToTellLikeDislike() {
        return easyToTellLikeDislike;
    }

    public void setEasyToTellLikeDislike(String easyToTellLikeDislike) {
        this.easyToTellLikeDislike = easyToTellLikeDislike;
    }

    public String getAttractiveLayout() {
        return attractiveLayout;
    }

    public void setAttractiveLayout(String attractiveLayout) {
        this.attractiveLayout = attractiveLayout;
    }

    public String getAdequateLayout() {
        return adequateLayout;
    }

    public void setAdequateLayout(String adequateLayout) {
        this.adequateLayout = adequateLayout;
    }

    public String getQuicklyFamiliarWithRecommender() {
        return quicklyFamiliarWithRecommender;
    }

    public void setQuicklyFamiliarWithRecommender(String quicklyFamiliarWithRecommender) {
        this.quicklyFamiliarWithRecommender = quicklyFamiliarWithRecommender;
    }

    public String getInControl() {
        return inControl;
    }

    public void setInControl(String inControl) {
        this.inControl = inControl;
    }

    public String getSatisfaction() {
        return satisfaction;
    }

    public void setSatisfaction(String satisfaction) {
        this.satisfaction = satisfaction;
    }

    public String getFutureUse() {
        return futureUse;
    }

    public void setFutureUse(String futureUse) {
        this.futureUse = futureUse;
    }
}