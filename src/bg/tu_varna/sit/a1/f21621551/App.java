package bg.tu_varna.sit.a1.f21621551;

import bg.tu_varna.sit.a1.f21621551.command.RealCommand;
import bg.tu_varna.sit.a1.f21621551.proxy.CommandProxy;

public class App {

    public static void main(String[] args) throws Exception {
        /*
        Използвайте Composite и Proxy моделите, за да създайте програма, 
        в която да може да се изпълняват системни команди.
        Системните команди могат да се изпълняват с или без ограничения. // proxy
        Първоначално се дефинират обекти със системни команди в обединен обект с всички команди. // composite
        При създаване на обект за изпълнение на команди с ограничения, 
        когато в списъка с команди присъстват команди с ограничения, се хвърля грешка за липсващи права за изпълнение.
        Последователно се изпълняват всички команди от обекта,
        като изхода от една команда може да е вход на следващата команда. */
       
       CommandProxy commandProxy = new CommandProxy();
        commandProxy.addSystemCommands(new RealCommand("cd", true));
        commandProxy.addSystemCommands(new RealCommand("mvn", true));
        commandProxy.addSystemCommands(new RealCommand("mn", true));
        try{
           System.out.println(commandProxy.runCommand());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
