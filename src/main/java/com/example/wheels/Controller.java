package com.example.wheels;


import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;


public class Controller {


    //Atributos de los paneles (Interfaces)
    @FXML
    private AnchorPane panelPrincipal;
    @FXML
    private AnchorPane panelIncio;
    @FXML
    private AnchorPane panelIzquierdoPasajero;
    @FXML
    private AnchorPane panelDerechoConductor;
    @FXML
    private AnchorPane panelRegsitroPasajero;
    @FXML
    private ScrollPane panelRegsitroConductor;
    @FXML
    private AnchorPane panelMenu;
    @FXML
    private AnchorPane PanelUsuario;


    // Atributos de los TextField de Inicio de Sesion
    @FXML
    private TextField iniciarCorreo;
    @FXML
    private TextField iniciarContrasena;


    //Atributos de los TextField de Registro pasajero

    @FXML
    private TextField textNombreP;
    @FXML
    private TextField textCorreoP;
    @FXML
    private TextField textContraseñaP;
    @FXML
    private TextField textUniversidadP;
    @FXML
    private TextField textTelefonoP;
    @FXML
    private TextField textCodigoP;


    //Atributos de los TextField de Registro conductor
    @FXML
    private TextField textNombreC;
    @FXML
    private TextField textCedulaC;
    @FXML
    private TextField textCorreoC;
    @FXML
    private TextField textContraseñaC;
    @FXML
    private TextField textUniversidadC;
    @FXML
    private TextField textTelefonoC;
    @FXML
    private TextField textMarcaC;
    @FXML
    private TextField textModeloC;
    @FXML
    private TextField textPlacaC;
    @FXML
    private TextField textPolizaC;
    @FXML
    private TextField textChasisC;
    @FXML
    private TextField textFechaExpC;


    public void botonSalir(MouseEvent event) { // metodo de icono salir
        Platform.exit();
        System.exit(0);
    }

    public void botonIniciar(MouseEvent event) { // metodo de icono salir

        panelPrincipal.setVisible(false);
        panelIncio.setVisible(true);
        panelIzquierdoPasajero.setVisible(false);
        panelDerechoConductor.setVisible(false);
        panelRegsitroPasajero.setVisible(false);
        panelRegsitroConductor.setVisible(false);
        panelMenu.setVisible(false);
        PanelUsuario.setVisible(false);

    }

    public void botonRegsitrarse(MouseEvent event) { // metodo de boton de incio para registrarse

        panelPrincipal.setVisible(false);
        panelIncio.setVisible(false);
        panelIzquierdoPasajero.setVisible(true);
        panelDerechoConductor.setVisible(true);
        panelRegsitroPasajero.setVisible(false);
        panelRegsitroConductor.setVisible(false);
        panelMenu.setVisible(false);
        PanelUsuario.setVisible(false);

    }

    public void botonIniciarSesion(MouseEvent event) {// metodo para verifcar inicio de sesion


        Pasajero.almacenarPasajero();
        Conductor.almacenarConductor();
        boolean error = false;


        for (int i = 0; i < Pasajero.pasajeros.size(); i++) {

            if ((iniciarCorreo.getText().equals(Pasajero.pasajeros.get(i).getCorreo())) && (iniciarContrasena.getText().equals(Pasajero.pasajeros.get(i).getContraseña()))) {

                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText(null);
                alert.setTitle("Bienvenido");
                alert.setContentText("Inicio de sesión correcto");
                alert.showAndWait();

                panelPrincipal.setVisible(false);
                panelIncio.setVisible(false);
                panelIzquierdoPasajero.setVisible(false);
                panelDerechoConductor.setVisible(false);
                panelRegsitroPasajero.setVisible(false);
                panelRegsitroConductor.setVisible(false);
                panelMenu.setVisible(true);
                PanelUsuario.setVisible(true);

                error = true;
            }
        }

        for (int i = 0; i < Conductor.conductores.size(); i++) {
            if ((iniciarCorreo.getText().equals(Conductor.conductores.get(i).getCorreo())) && (iniciarContrasena.getText().equals(Conductor.conductores.get(i).getContraseña()))) {

                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText(null);
                alert.setTitle("Bienvenido");
                alert.setContentText("Inicio de sesión correcto");
                alert.showAndWait();

                panelPrincipal.setVisible(false);
                panelIncio.setVisible(false);
                panelIzquierdoPasajero.setVisible(false);
                panelDerechoConductor.setVisible(false);
                panelRegsitroPasajero.setVisible(false);
                panelRegsitroConductor.setVisible(false);
                panelMenu.setVisible(true);
                PanelUsuario.setVisible(true);

                error = true;
            }
        }

        if (error == false) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Usuario y/o contraseña incorrectas");
            alert.showAndWait();
        }
    }


    public void botonAtras(MouseEvent event) { // metodo de boton para devolver al panle principal

        panelPrincipal.setVisible(true);
        panelIncio.setVisible(false);
        panelIzquierdoPasajero.setVisible(false);
        panelDerechoConductor.setVisible(false);
        panelRegsitroPasajero.setVisible(false);
        panelRegsitroConductor.setVisible(false);
        panelMenu.setVisible(false);
        PanelUsuario.setVisible(false);
    }

    public void botonPasajero(MouseEvent event) { // metodo de boton para llevar al registro de pasasjero

        panelPrincipal.setVisible(false);
        panelIncio.setVisible(false);
        panelIzquierdoPasajero.setVisible(false);
        panelDerechoConductor.setVisible(false);
        panelRegsitroPasajero.setVisible(true);
        panelRegsitroConductor.setVisible(false);
        panelMenu.setVisible(false);
        PanelUsuario.setVisible(false);

    }

    public void botonConductor(MouseEvent event) { // metodo de boton para llevar al registro de conductor

        panelPrincipal.setVisible(true);
        panelIncio.setVisible(false);
        panelIzquierdoPasajero.setVisible(false);
        panelDerechoConductor.setVisible(false);
        panelRegsitroPasajero.setVisible(false);
        panelRegsitroConductor.setVisible(false);
        panelMenu.setVisible(false);
        PanelUsuario.setVisible(false);

    }

    public void botonRegistrarPasajero(MouseEvent event) { // metodo de boton para llevar al registro de conductor

        Pasajero.almacenarPasajero();
        Conductor.almacenarConductor();
        boolean error = false;

        for (int i = 0; i < Pasajero.pasajeros.size(); i++) {
            if (!textCorreoP.getText().equals(Pasajero.pasajeros.get(i).getCorreo())) {

                Registro registro = new Registro();
                registro.registrarPasajero(textNombreP.getText(), textCorreoP.getText(), textContraseñaP.getText(), textUniversidadP.getText(), textTelefonoP.getText(), textCodigoP.getText());

                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText(null);
                alert.setTitle("Bienvenido");
                alert.setContentText("Usuario creado correctamente");
                alert.showAndWait();

                panelPrincipal.setVisible(true);
                panelIncio.setVisible(false);
                panelIzquierdoPasajero.setVisible(false);
                panelDerechoConductor.setVisible(false);
                panelRegsitroPasajero.setVisible(false);
                panelRegsitroConductor.setVisible(false);
                panelMenu.setVisible(false);
                PanelUsuario.setVisible(false);

                i = Pasajero.pasajeros.size();
                error = true;
            }
        }
        if (error == false) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Correo ya existente");
            alert.showAndWait();
        }
    }

    public void botonRegistrarConductor(MouseEvent event) { // metodo de boton para llevar al registro de conductor


        Pasajero.almacenarPasajero();
        Conductor.almacenarConductor();
        boolean error = false;

        for (int i = 0; i < Conductor.conductores.size(); i++) {
            if (!textCorreoC.getText().equals(Conductor.conductores.get(i).getCorreo())) {

                Registro registro = new Registro();
                registro.registrarConductores(textNombreC.getText(), textCorreoC.getText(), textContraseñaC.getText(), textUniversidadC.getText(), textTelefonoC.getText(), textCedulaC.getText(), textMarcaC.getText(), textModeloC.getText(), textPlacaC.getText(), textPolizaC.getText(), textChasisC.getText(), textFechaExpC.getText());

                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText(null);
                alert.setTitle("Bienvenido");
                alert.setContentText("Usuario creado correctamente");
                alert.showAndWait();

                panelPrincipal.setVisible(true);
                panelIncio.setVisible(false);
                panelIzquierdoPasajero.setVisible(false);
                panelDerechoConductor.setVisible(false);
                panelRegsitroPasajero.setVisible(false);
                panelRegsitroConductor.setVisible(false);
                panelMenu.setVisible(false);
                PanelUsuario.setVisible(false);

                i = Conductor.conductores.size();
                error = true;
            }
        }
        if (error == false) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Correo ya existente");
            alert.showAndWait();
        }
    }

}







