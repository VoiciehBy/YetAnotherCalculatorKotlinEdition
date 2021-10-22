package edu.voiciehb.yetanothercalculatorkotlinedition

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.stage.Stage

class YACalcKotlinEdition : Application() {
    override fun start(stage: Stage) {
        val fxmlLoader = FXMLLoader(YACalcKotlinEdition::class.java.getResource("main-view.fxml"))
        val scene = Scene(fxmlLoader.load(), 600.0, 400.0)
        stage.title = "Calculator by VoiciehBy!"
        stage.scene = scene
        stage.isResizable = false;
        stage.show()
    }
}

fun main() {
    Application.launch(YACalcKotlinEdition::class.java)
}