package bdd.step;

import bdd.view.HomeView;
import bdd.view.ResultsView;

public class YoutubeStep {

    private HomeView homeView(){
        return new HomeView();
    }
    private ResultsView resultsView(){
        return new ResultsView();
    }
    public void searchVideo(String video) {
        homeView().goSearch();
        homeView().typeVideo(video);
        homeView().enterKey();
    }


    public int getSizeResult() {
        return resultsView().getSizeResult();
    }
}
