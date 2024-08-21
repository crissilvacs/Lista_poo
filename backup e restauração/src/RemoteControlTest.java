import java.util.ArrayList;
import java.util.List;

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
            Command tvOff = new TVOffCommand(tv, commandHistory);
            Command lightOn = new LightOnCommand(light, commandHistory);
            Command lightOff = new LightOffCommand(light, commandHistory);
            Command garageDoorUp = new GarageDoorUpCommand(garageDoor, commandHistory);
            Command garageDoorDown = new GarageDoorDownCommand(garageDoor, commandHistory);
            Command soundOn = new SoundOnCommand(sound, commandHistory);
            Command soundOff = new SoundOffCommand(sound, commandHistory);
            Command ceilingFanHigh = new CeilingFanHighCommand(ceilingFan, commandHistory);
            Command ceilingFanOff = new CeilingFanOffCommand(ceilingFan, commandHistory);
            Command hotTubJetsOn = new HotTubJetsOnCommand(hotTub, commandHistory);
            Command hotTubJetsOff = new HotTubJetsOffCommand(hotTub, commandHistory);
            Command securityControlArm = new SecurityControlArmCommand(securityControl, commandHistory);
            Command securityControlDisarm = new SecurityControlDisarmCommand(securityControl, commandHistory);

            // Execução dos comandos
            tvOn.execute();
            tvOn.store();

            lightOn.execute();
            lightOn.store();

            tvOff.execute();
            tvOff.store();

            lightOff.execute();
            lightOff.store();

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

            // Salvando o histórico
            CommandHistory.saveHistory(commandHistory, "command_history.ser");

            // Simulação de falha e recuperação
            System.out.println("\n--- System Reboot ---\n");
            List<Command> loadedHistory = CommandHistory.loadHistory("command_history.ser");
            CommandHistory.executeHistory(loadedHistory);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
