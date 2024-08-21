import java.util.List;
import java.util.ArrayList;
import java.io.IOException;

public class RemoteControlTest {
    public static void main(String[] args) {
        try {
            // Criação dos dispositivos
            TV tv = new TV();
            Light light = new Light();
            GarageDoor garageDoor = new GarageDoor();
            Sound sound = new Sound();
            CeilingFan ceilingFan = new CeilingFan();
            HotTub hotTub = new HotTub();
            SecurityControl securityControl = new SecurityControl();

            // Lista para armazenar os comandos
            List<Command> commandHistory = new ArrayList<>();

            // Criação dos comandos
            Command tvOn = new TVOnCommand(tv, commandHistory);
            Command lightOn = new LightOnCommand(light, commandHistory);
            Command garageDoorUp = new GarageDoorUpCommand(garageDoor, commandHistory);
            Command soundOn = new SoundOnCommand(sound, commandHistory);
            Command ceilingFanHigh = new CeilingFanHighCommand(ceilingFan, commandHistory);
            Command hotTubJetsOn = new HotTubJetsOnCommand(hotTub, commandHistory);
            Command securityControlArm = new SecurityControlArmCommand(securityControl, commandHistory);

            // Exemplo de uso de comandos
            tvOn.execute();
            tvOn.store();

            lightOn.execute();
            lightOn.store();

            garageDoorUp.execute();
            garageDoorUp.store();

            soundOn.execute();
            soundOn.store();

            ceilingFanHigh.execute();
            ceilingFanHigh.store();

            hotTubJetsOn.execute();
            hotTubJetsOn.store();

            securityControlArm.execute();
            securityControlArm.store();

            // Simulação de queda de energia
            System.out.println("\n--- Simulando Queda de Energia ---\n");
            simulatePowerOutage(tv, light, garageDoor, sound, ceilingFan, hotTub, securityControl);

            // Simulação de restauração de energia
            System.out.println("\n--- Reiniciando Sistema ---\n");
            powerbacksimulation(tv, light, garageDoor, sound, ceilingFan, hotTub, securityControl);
            List<Command> loadedHistory = CommandHistory.loadHistory("command_history.ser");
            CommandHistory.executeHistory(loadedHistory);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    // Método para simular a queda de energia
    private static void simulatePowerOutage(TV tv, Light light, GarageDoor garageDoor, Sound sound, CeilingFan ceilingFan, HotTub hotTub, SecurityControl securityControl) {
        tv.off();
        light.off();
        garageDoor.down();
        sound.off();
        ceilingFan.off();
        hotTub.jetsOff();
        securityControl.disarm();
    }
    private static void powerbacksimulation(TV tv, Light light, GarageDoor garageDoor, Sound sound, CeilingFan ceilingFan, HotTub hotTub, SecurityControl securityControl) {
        tv.on();
        light.on();
        garageDoor.up();
        sound.on();
        ceilingFan.high();
        hotTub.jetsOn();
        securityControl.arm();
    }
}
