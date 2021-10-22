package edu.voiciehb.yetanothercalculatorkotlinedition

import javafx.event.ActionEvent
import javafx.fxml.FXML
import javafx.scene.control.Label

class MainController {
    @FXML
    lateinit var resultLabel: Label;

    private var isPlusButtonPressed = false;
    private var isMinusButtonPressed = false;
    private var isStarButtonPressed = false;
    private var isSlashButtonPressed = false;

    private fun sum(value: Int): String {
        return (Integer.parseInt(resultLabel.text) + value).toString(); }

    private fun difference(value: Int): String {
        return (Integer.parseInt(resultLabel.text) - value).toString(); }

    private fun product(value: Int): String {
        return (Integer.parseInt(resultLabel.text) * value).toString(); }

    private fun quotient(value: Int): String {
        if (value != 0)
            return (Integer.parseInt(resultLabel.text) / value).toString();
        else return "?";
    }

    private fun handleArithmeticOperations(value: Int): Unit {
        if (isPlusButtonPressed) {
            resultLabel.text = sum(value)
            isPlusButtonPressed = false
        } else if (isMinusButtonPressed) {
            resultLabel.text = difference(value)
            isMinusButtonPressed = false
        } else if (isStarButtonPressed) {
            resultLabel.text = product(value)
            isStarButtonPressed = false
        } else if (isSlashButtonPressed) {
            resultLabel.text = quotient(value)
            isSlashButtonPressed = false
        } else resultLabel.text = value.toString()
    }

    public fun oneButtonOnAction(actionEvent: ActionEvent) {
        handleArithmeticOperations(1)
    }
    public fun twoButtonOnAction(actionEvent: ActionEvent) {
        handleArithmeticOperations(2)
    }
    public fun threeButtonOnAction(actionEvent: ActionEvent) {
        handleArithmeticOperations(3)
    }
    public fun fourButtonOnAction(actionEvent: ActionEvent) {
        handleArithmeticOperations(4)
    }
    public fun fiveButtonOnAction(actionEvent: ActionEvent) {
        handleArithmeticOperations(5)
    }
    public fun sixButtonOnAction(actionEvent: ActionEvent) {
        handleArithmeticOperations(6)
    }
    public fun sevenButtonOnAction(actionEvent: ActionEvent) {
        handleArithmeticOperations(7)
    }
    public fun eightButtonOnAction(actionEvent: ActionEvent) {
        handleArithmeticOperations(8)
    }
    public fun nineButtonOnAction(actionEvent: ActionEvent) {
        handleArithmeticOperations(9)
    }
    public fun zeroButtonOnAction(actionEvent: ActionEvent) {
        handleArithmeticOperations(0)
    }

    public fun plusButtonOnAction(actionEvent: ActionEvent) {
        isPlusButtonPressed = true
    }
    public fun minusButtonOnAction(actionEvent: ActionEvent) {
        isMinusButtonPressed = true
    }
    public fun starButtonOnAction(actionEvent: ActionEvent) {
        isStarButtonPressed = true
    }
    public fun slashButtonOnAction(actionEvent: ActionEvent) {
        isSlashButtonPressed = true
    }
    public fun equalButtonOnAction(actionEvent: ActionEvent) {
        resultLabel.text = resultLabel.text
    }
}