/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puzzlegui;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author RecepKaraca
 */
public class Score {

    private static String username;
    private static double score;
    private static double highScore;

    public String getUsername() {
        return username;
    }

    public void setUsername(String received) {
        username = received;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double received) {
        score = received;
    }

    public double getHighScore() {
        return highScore;
    }

    public void setHighScore(double received) {
        highScore = received;
    }

    public void Score() {
        score = 0;
        highScore = 0;
        username = "DefaultUser";
    }
    
    public void plusScore(double value){
        score += value;
    }
    public void minusScore(double value){
        score -= value;
    }
    
    public void highScoreCompare(){
        if(score > highScore)
            highScore = score;
    }

    public void readFile() {
        try { 
            File f = new File("highScore.txt");
            f.createNewFile();
            FileReader read = new FileReader(f);
            String line;
            
            BufferedReader br = new BufferedReader(read);
            
            while ((line = br.readLine()) != null) {
                String[] userScore =  line.split(",");
                if(userScore[0].equals(username) && Double.parseDouble(userScore[1]) > highScore)
                    highScore = Double.parseDouble(userScore[1]);
            }
            
            br.close();
        } catch (IOException ex) {
            Logger.getLogger(Score.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean isFileEmpty(){
        boolean isEmpty = true;
        try { 
            File f = new File("highScore.txt");
            f.createNewFile();
            FileReader read = new FileReader(f);
            String line;
            
            BufferedReader br = new BufferedReader(read);
            
            while ((line = br.readLine()) != null) {
                isEmpty = false;
            }
            br.close();
        } catch (IOException ex) {
            Logger.getLogger(Score.class.getName()).log(Level.SEVERE, null, ex);
        }
        return isEmpty;
    }
    
    public void writeFile(){
        try {
            File file = new File("highScore.txt");
            if (!file.exists()) {
                file.createNewFile();
            }   
            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter wr = new BufferedWriter(fileWriter);
            if(isFileEmpty()) {
                wr.write(username + "," + score);
            } else {
                wr.newLine();
                wr.write(username + "," + score);
            }
            wr.close();
            fileWriter.close();
        } catch (IOException ex) {
            Logger.getLogger(Score.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
}
