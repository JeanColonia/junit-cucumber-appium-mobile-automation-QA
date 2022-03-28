package bdd.step;

import bdd.view.HomeView;
import bdd.view.ResultsView;

public class LinioStep {
    private HomeView homeView(){
        return new HomeView();
    }
    private ResultsView resultsView(){
        return new ResultsView();
    }

    public void searchProduct(String product) {
      homeView().typeProduct(product);
    }

    public void selectProductOfComboResult(){
      homeView().selectProductOfComboResult();
    }
    public void selectItemOfResultProducts(){
        resultsView().selectItemOfResultProducts();
    }

    public void addProductToCart(){
     resultsView().addProductToCart();
    }

    public void viewCartContainer(){
      resultsView().viewCartContainer();
    }
}
