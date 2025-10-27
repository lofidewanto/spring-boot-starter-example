package com.example.app.views;

import com.example.greeting.GreetingService;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("")
public class HomeView extends VerticalLayout {

    private final GreetingService greetingService;

    public HomeView(GreetingService greetingService) {
        this.greetingService = greetingService;

        add(new H1("Welcome to your new application"));
        add(new Paragraph("This is the home view"));
        add(new Paragraph(greetingService.greet("Lofi")));
        add(new Paragraph("You can edit this view in src/main/java/com/example/app/views/HomeView.java"));
    }
}
