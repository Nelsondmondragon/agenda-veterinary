package com.nedacort.agendaveterinary.views.login;

import com.vaadin.flow.component.login.LoginOverlay;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import lombok.Data;

@Data
@Route("")
public class Login extends VerticalLayout {

    private LoginOverlay login = new LoginOverlay();

    public Login() {
        configComponents();
        add(login);
    }

    private void configComponents() {
        login.setOpened(true);
    }

}
