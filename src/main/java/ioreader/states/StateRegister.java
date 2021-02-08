package ioreader.states;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class StateRegister {

    private List<State> states = new ArrayList<>();

    public void readStatesfromFile(String fileName) {

        Path file = Path.of(fileName);

        try {
            BufferedReader reader = Files.newBufferedReader(file);
            String line;
            String[] splittedLine;

            while ((line = reader.readLine()) != null){
                splittedLine = line.split("-");
                states.add(new State(splittedLine[0], splittedLine[1]));
            }

        }catch (IOException ioe){
            throw new IllegalStateException("Cannot read file!", ioe);
        }


    }

    public String findCapitalByStateName(String stateName){
        String capitalName = "";

        for (State state : states){
            if(stateName.equals(state.getStateName())){
                capitalName = state.getCapital();
            }
        }

        if (!capitalName.equals("")){
            return capitalName;
        }else{
        throw new IllegalArgumentException("The state is not exists!");
        }
    }
}
