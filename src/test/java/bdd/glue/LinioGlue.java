package bdd.glue;

import bdd.step.LinioStep;
import bdd.step.YoutubeStep;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import mobile.ManageScenario;
import mobile.MobileDriverManager;
import mobile.Util;

public class LinioGlue {
    private LinioStep linioStep;
    private Scenario scenario;
    @Before
    public void beforeScenario(Scenario scenario) {
        this.scenario = scenario;
        ManageScenario.setScenario(this.scenario);
        linioStep = new LinioStep();
        Util.waitThread(1000);
    }

    @After
    public void afterScenario() {
        if(this.scenario.isFailed())
            Util.takeScreeShot();
        MobileDriverManager.quitDriver();
        Util.waitThread(1000);
    }


    @Dado("que estoy en el Home de Linio")
    public void que_estoy_en_el_home_de_linio() {
        MobileDriverManager.setMobileDriver();
        Util.takeScreeShot();
        Util.waitThread(2000);
    }
    @Cuando("selecciono la barra de busqueda e ingreso un producto {string}")
    public void selecciono_la_barra_de_busqueda_e_ingreso_un_producto(String producto) {
        linioStep.searchProduct(producto);
        Util.takeScreeShot();
        Util.waitThread(2000);

    }
    @Cuando("selecciono el segundo item del combo con los resultados")
    public void selecciono_el_segundo_item_del_combo_con_los_resultados() {
        Util.takeScreeShot();
        linioStep.selectProductOfComboResult();
         Util.waitThread(2000);
    }
    @Cuando("seleccionamos el primer elemento que nos muestra en la pagina de resultados de busqueda")
    public void seleccionamos_el_primer_elemento_que_nos_muestra_en_la_pagina_de_resultados_de_busqueda() {
        linioStep.selectItemOfResultProducts();
        Util.waitThread(2000);
        Util.takeScreeShot();

    }
    @Cuando("agregamos al carrito de compras dicho elemento seleccionado")
    public void agregamos_al_carrito_de_compras_dicho_elemento_seleccionado() {
    linioStep.addProductToCart();
        Util.takeScreeShot();
        Util.waitThread(1500);
    }
    @Cuando("vamos a nuestro carrito de compras para visualizar elemento")
    public void vamos_a_nuestro_carrito_de_compras_para_visualizar_elemento() {
        linioStep.viewCartContainer();
        Util.waitThread(2000);
        Util.takeScreeShot();


    }
    @Entonces("visualizamos nuestro producto seleccionado con sus detalles")
    public void visualizamos_nuestro_producto_seleccionado_con_sus_detalles() {
    Util.waitThread(2000);
    Util.takeScreeShot();

    }


}
