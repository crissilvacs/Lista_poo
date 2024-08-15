public class Main {
    public static void main(String[] args) {
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        RemoteControl remoteControl = new RemoteControl();

        // Ligar a luz da sala de estar
        remoteControl.executeCommand(livingRoomLightOn);

        // Ligar a luz da cozinha
        remoteControl.executeCommand(kitchenLightOn);

        // Desligar a luz da sala de estar (USANDO livingRoomLightOff)
        remoteControl.executeCommand(livingRoomLightOff);

        // Desligar a luz da cozinha
        remoteControl.executeCommand(kitchenLightOff);

        // Armazenar os comandos em um arquivo
        remoteControl.storeCommands();

        // Simulação de pane elétrica e recuperação do estado anterior
        System.out.println("\nSimulação de pane elétrica...\n");
        remoteControl.loadCommands();
    }
}
