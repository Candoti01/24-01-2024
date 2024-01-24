package controller;
import java.util.*;
import model.*;
import view.*;

public class App {
    public static void main(String[] args) {
        InterfacePadoka.resultadoModelDisponivel = "";
        UserInteraction.respostaCliente();    
    }

    public static void CardapioBusca() {
        CardapioModel.exibirCardapio();
        CardapioExibir.ExibindoCardapio();

    }

    public static void Log_CadUser() {
        
    }
}
