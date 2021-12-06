package com.dz;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class Main extends Application{

    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage stage) {
        Calculator calc = new Calculator(); // создаем объект-калькулятор
        TextField input = new TextField();  // создаем текстовое поле
        input.setPrefSize(285, 40);
        TextField output = new TextField();
        output.setPrefSize(285, 40);
        Button plus = new Button("+"); // создание кнопки "+"
        plus.setPrefSize(45, 45);  // задаем размер кнопки
        Button minus = new Button("-"); // далее по аналогии
        minus.setPrefSize(45, 45);
        Button multiplication= new Button("*");
        multiplication.setPrefSize(45, 45);
        Button division = new Button("/");
        division.setPrefSize(45, 45);
        Button equally = new Button("=");
        equally.setPrefSize(50, 50);
        plus.setOnAction(new EventHandler<ActionEvent>() { // при нажатии на "+"
            @Override
            public void handle(ActionEvent event) {
                String str = input.getText().toString(); // считываем строку
                input.clear(); // очищаем текстовое поле
                double c = Double.parseDouble(str); // считываем число
                calc.setC1(c); // инициализируем поле c1 калькулятора
                calc.setOperation("+"); // определяем нужную операцию
            }
        });
        division.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String str = input.getText().toString();
                input.clear();
                double c = Double.parseDouble(str);
                calc.setC1(c);
                calc.setOperation("/");
            }
        });
        multiplication.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String str = input.getText().toString();
                input.clear();
                double c = Double.parseDouble(str);
                calc.setC1(c);
                calc.setOperation("*");
            }
        });
        minus.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String str = input.getText().toString();
                input.clear();
                double c = Double.parseDouble(str);
                calc.setC1(c);
                calc.setOperation("-");
            }
        });
        equally.setOnAction(new EventHandler<ActionEvent>() {// при нажатии на "="
            @Override
            public void handle(ActionEvent event) {
                String str = input.getText().toString();
                input.clear();
                double c = Double.parseDouble(str);
                calc.setC2(c); // инициализируем поле c2 калькулятора
                output.setText(Double.toString(calc.Calculate())); // выводим результат в поле output
            }
        });
        FlowPane root = new FlowPane(10, 10, input, plus, minus, multiplication, division, equally, output);
        Scene scene = new Scene(root, 250, 200);
        stage.setScene(scene);
        stage.setTitle("Калькулятор"); // установка заголовка окна
        stage.setWidth(300);
        stage.setHeight(250);
        stage.show();
    }
}