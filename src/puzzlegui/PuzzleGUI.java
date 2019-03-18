/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puzzlegui;

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.awt.image.DataBuffer;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import sun.awt.image.ToolkitImage;

/**
 *
 * @author RecepKaraca
 */
public class PuzzleGUI extends javax.swing.JFrame {

    /**
     * Creates new form PuzzleGUI
     */
    ArrayList<Icon> clickedImages;
    ArrayList<JButton> clickedButtons;
    Map<JButton, BufferedImage> originalBtnImg;
    BufferedImage[] slices;
    JButton[] buttons;
    private File f;
    int sumOfCorrectParts = 0;
    int failture = 0;
    Score scoreClass;

    public PuzzleGUI(String s) {
        initComponents();
        clickedImages = new ArrayList<Icon>();
        clickedButtons = new ArrayList<JButton>();
        originalBtnImg = new HashMap<JButton, BufferedImage>();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        setFilePath(s);
        readImage();
        for (int i = 0; i < buttons.length; i++) {
            buttons[i].setEnabled(false);
        }
        scoreClass = new Score();
        scoreClass.setScore(0);
        scoreClass.readFile();
        usernamelb.setText("Username: " + scoreClass.getUsername());
        scorelb.setText("Score: " + scoreClass.getScore());
        highscorelb.setText("High Score: " + scoreClass.getHighScore());
        faillb.setText("Total failture: " + failture);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        mixUp = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        usernamelb = new javax.swing.JLabel();
        scorelb = new javax.swing.JLabel();
        highscorelb = new javax.swing.JLabel();
        faillb = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 160));

        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 160, 160));

        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 160, 160));

        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 160, 160));

        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 160, 160));

        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 160, 160));

        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 160, 160));

        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 160, 160));

        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 160, 160));

        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 160, 160));

        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 160, 160));

        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, 160, 160));

        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 480, 160, 160));

        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 480, 160, 160));

        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 160, 160));

        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 480, 160, 160));

        mixUp.setText("Mix");
        mixUp.setActionCommand("");
        mixUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mixUpActionPerformed(evt);
            }
        });
        getContentPane().add(mixUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 650, 160, 69));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 704, -1, -1));

        usernamelb.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        usernamelb.setForeground(new java.awt.Color(51, 51, 255));
        usernamelb.setText("jLabel2");
        getContentPane().add(usernamelb, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 650, -1, -1));

        scorelb.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        scorelb.setForeground(new java.awt.Color(255, 153, 0));
        scorelb.setText("jLabel3");
        getContentPane().add(scorelb, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 670, -1, -1));

        highscorelb.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        highscorelb.setForeground(new java.awt.Color(0, 204, 0));
        highscorelb.setText("jLabel4");
        getContentPane().add(highscorelb, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 690, -1, -1));

        faillb.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        faillb.setForeground(new java.awt.Color(255, 0, 0));
        faillb.setText("jLabel2");
        getContentPane().add(faillb, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 675, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setFilePath(String s) {
        f = new File(s);
    }

    public void readImage() {
        final int width = 640;
        final int height = 640;
        BufferedImage image = null;

        //read image
        try {
            image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
            image = ImageIO.read(f);
            System.out.println("Reading complete.");
            File output = new File("output.jpg");
            Image newImage = image.getScaledInstance(width, height, Image.SCALE_DEFAULT);
            ImageIO.write(toBufferedImage(newImage), "jpg", output);
            //jLabel1.setIcon(new ImageIcon(image.getScaledInstance(640, 640, image.SCALE_DEFAULT)));
            File f2 = new File("output.jpg"); //image file path
            BufferedImage image2 = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
            image2 = ImageIO.read(f2);

            final int w = 160;
            final int h = 160;
            final int rows = 4;
            final int cols = 4;
            slices = new BufferedImage[rows * cols];

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    slices[(i * cols) + j] = image2.getSubimage(j * w, i * h, w, h);
                }
            }

            buttons = new JButton[16];
            buttons[0] = jButton1;
            buttons[1] = jButton2;
            buttons[2] = jButton3;
            buttons[3] = jButton4;
            buttons[4] = jButton5;
            buttons[5] = jButton6;
            buttons[6] = jButton7;
            buttons[7] = jButton8;
            buttons[8] = jButton9;
            buttons[9] = jButton10;
            buttons[10] = jButton11;
            buttons[11] = jButton12;
            buttons[12] = jButton13;
            buttons[13] = jButton14;
            buttons[14] = jButton15;
            buttons[15] = jButton16;
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }

    public static boolean compareImage(BufferedImage fileA, BufferedImage fileB) {
        try {
            BufferedImage biA = fileA;
            DataBuffer dbA = biA.getData().getDataBuffer();
            int sizeA = dbA.getSize();
            BufferedImage biB = fileB;
            DataBuffer dbB = biB.getData().getDataBuffer();
            int sizeB = dbB.getSize();
            if (sizeA == sizeB) {
                for (int i = 0; i < sizeA; i++) {
                    if (dbA.getElem(i) != dbB.getElem(i)) {
                        return false;
                    }
                }
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            System.out.println("Failed to compare image files ...");
            return false;
        }
    }

    /*
    public void controlCorrectParts(){
        int sumOfCorrectPartsLocal = 0;
        for(int i = 0; i < originalBtnImg.size(); i++){
            ImageIcon yourImage = (ImageIcon) buttons[i].getIcon();
            Image img = yourImage.getImage();
            BufferedImage buffered = (BufferedImage) img;
            if(compareImage(buffered, originalBtnImg.get(buttons[i]))){
                sumOfCorrectPartsLocal++;
            }
        }
        System.out.println("Sum of correct parts : " + sumOfCorrectParts);
        System.out.println("Sum of local correct parts : " + sumOfCorrectPartsLocal);
        System.out.println("Total failtureture: " + failture);
        System.out.println("------------");
        if(sumOfCorrectPartsLocal > sumOfCorrectParts){  
            if(failture == 0)
                score += Math.abs(sumOfCorrectPartsLocal - sumOfCorrectParts) * 6.25;
            else{
                double addValue = 0;
                if(failture < 12)
                    addValue = Math.abs(sumOfCorrectPartsLocal - sumOfCorrectParts) * 6.25 - (failture * 0.5);
                else
                    addValue = Math.abs(sumOfCorrectPartsLocal - sumOfCorrectParts) * 6.25 - (5.75);
                score += addValue;
                System.out.println("Add value: " + addValue);
            }
            if(score > 100)
                score = 100;
        }else if(sumOfCorrectPartsLocal <= sumOfCorrectParts){
            
            if(Math.abs(sumOfCorrectPartsLocal - sumOfCorrectParts) == 0)
                score -= 10;
            score -= Math.abs(sumOfCorrectPartsLocal - sumOfCorrectParts) * 10;
            if(score < 0)
                score = 0;
        }
        sumOfCorrectParts = 0;
        for(int i = 0; i < originalBtnImg.size(); i++){
            ImageIcon yourImage = (ImageIcon) buttons[i].getIcon();
            Image img = yourImage.getImage();
            BufferedImage buffered = (BufferedImage) img;
            if(compareImage(buffered, originalBtnImg.get(buttons[i]))){
                sumOfCorrectParts++;
            }
        }
        //System.out.println("Sum of correct parts : " + sumOfCorrectParts);
        System.out.println("score: " + score);
    }
     */
    public boolean isSolved() {
        int sumOfCorrectPartsLocal = 0;
        for (int i = 0; i < originalBtnImg.size(); i++) {
            ImageIcon yourImage = (ImageIcon) buttons[i].getIcon();
            Image img = yourImage.getImage();
            BufferedImage buffered = (BufferedImage) img;
            if (compareImage(buffered, originalBtnImg.get(buttons[i]))) {
                sumOfCorrectPartsLocal++;
            }
        }
        if (sumOfCorrectPartsLocal == 16) {
            return true;
        } else {
            return false;
        }
    }
    
    public int totalCorrectParts(){
        int sumOfCorrectPartsLocal = 0;
        for (int i = 0; i < originalBtnImg.size(); i++) {
            ImageIcon yourImage = (ImageIcon) buttons[i].getIcon();
            Image img = yourImage.getImage();
            BufferedImage buffered = (BufferedImage) img;
            if (compareImage(buffered, originalBtnImg.get(buttons[i]))) {
                sumOfCorrectPartsLocal++;
            }
        }
        return sumOfCorrectPartsLocal;
    }

    public void finalizePuzzle() {
        JOptionPane.showMessageDialog(null, "Puzzle solved!");
        for (int i = 0; i < buttons.length; i++) {
            buttons[i].setEnabled(false);
        }
        if(scoreClass.getScore() > scoreClass.getHighScore()){
            highscorelb.setText("High Score: " + scoreClass.getScore());
        }else{
            highscorelb.setText("High Score: " + scoreClass.getHighScore());
        }
        faillb.setText("Total failture: " + failture);
        scoreClass.writeFile();
    }

    public void controlCorrectParts() {
        sumOfCorrectParts = 0;
        for (int i = 0; i < clickedButtons.size(); i++) {
            ImageIcon yourImage = (ImageIcon) clickedButtons.get(i).getIcon();
            Image img = yourImage.getImage();
            BufferedImage buffered = (BufferedImage) img;
            if (compareImage(buffered, originalBtnImg.get(clickedButtons.get(i)))) {
                sumOfCorrectParts++;
            }
        }
        if (sumOfCorrectParts == 0) {
            scoreClass.minusScore(10);
            failture++;
        } else {
            double addValue = 0;
            if (failture < 12) {
                addValue = (sumOfCorrectParts * 6.25) - (failture * 0.5);
            } else {
                addValue = (sumOfCorrectParts * 6.25) - (5.75);
            }
            scoreClass.plusScore(addValue);
        }
        if (scoreClass.getScore() > 100) {
            scoreClass.setScore(100);
        } else if (scoreClass.getScore() < 0) {
            scoreClass.setScore(0);
        }
        System.out.println("Failture: " + failture);
        System.out.println("Score: " + scoreClass.getScore());
        scorelb.setText("Score: " + scoreClass.getScore());
        if(scoreClass.getScore() > scoreClass.getHighScore()){
            highscorelb.setText("High Score: " + scoreClass.getScore());
        }else{
            highscorelb.setText("High Score: " + scoreClass.getHighScore());
        }
        faillb.setText("Total failture: " + failture);
        if (isSolved()) {
            finalizePuzzle();
        }
    }

    private void mixUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mixUpActionPerformed
        // TODO add your handling code here:
        for (int i = 0; i < slices.length; i++) {
            originalBtnImg.put(buttons[i], slices[i]);
            buttons[i].setIcon(new ImageIcon(slices[i]));
        }

        int correctCounter = 0;
        ArrayList<BufferedImage> slicesAL = new ArrayList<BufferedImage>();
        for (int i = 0; i < slices.length; i++) {
            slicesAL.add(slices[i]);
        }
        int slicesALLength = 16;
        for (int i = 0; i < buttons.length; i++) {
            Random rnd = new Random();
            int gonnaRemove = rnd.nextInt(slicesALLength);
            //System.out.println(gonnaRemove + " , " + gonnaRemove);
            buttons[i].setIcon(new ImageIcon(slicesAL.get(gonnaRemove)));
            slicesAL.remove(gonnaRemove);
            slicesALLength--;
        }
        for (int i = 0; i < buttons.length; i++) {
            ImageIcon yourImage = (ImageIcon) buttons[i].getIcon();
            Image img = yourImage.getImage();
            BufferedImage buffered = (BufferedImage) img;
            if (compareImage(buffered, originalBtnImg.get(buttons[i]))) {
                correctCounter++;
                System.out.println("Correct picture in button" + (i + 1));
            }
        }
        if (correctCounter != 0) {
            JOptionPane.showMessageDialog(null, "Some parts of the puzzle is in "
                    + "the correct location. There is no need to mix puzzle anymore. (Mix button disabled.)");
            mixUp.setEnabled(false);
        }
        System.out.println("-------");
        scoreClass.setScore(0);
        scoreClass.plusScore(totalCorrectParts() * 6.25);
        scorelb.setText("Score: " + scoreClass.getScore());
        if(scoreClass.getScore() > scoreClass.getHighScore()){
            highscorelb.setText("High Score: " + scoreClass.getScore());
        }else{
            highscorelb.setText("High Score: " + scoreClass.getHighScore());
        }
        faillb.setText("Total failture: " + failture);
        for (int i = 0; i < buttons.length; i++) {
            buttons[i].setEnabled(true);
        }
        if(isSolved())
            finalizePuzzle();
        //jButton1.setIcon(new ImageIcon(slices[0]));
    }//GEN-LAST:event_mixUpActionPerformed

    private void swapParts(){
        if (clickedButtons.size() > 2) {
            clickedButtons.clear();
        }

        if (clickedButtons.size() == 2 && clickedButtons.get(0) != clickedButtons.get(1)) {
            Icon temp = clickedButtons.get(0).getIcon();
            clickedButtons.get(0).setIcon(clickedButtons.get(1).getIcon());
            clickedButtons.get(1).setIcon(temp);
            controlCorrectParts();
            clickedButtons.clear();
        }
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        clickedButtons.add(jButton1);
        swapParts();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        clickedButtons.add(jButton2);
        swapParts();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        clickedButtons.add(jButton3);
        swapParts();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        clickedButtons.add(jButton4);
        swapParts();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        clickedButtons.add(jButton5);
        swapParts();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        clickedButtons.add(jButton6);
        swapParts();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        clickedButtons.add(jButton7);
        swapParts();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        clickedButtons.add(jButton8);
        swapParts();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        clickedButtons.add(jButton9);
        swapParts();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        clickedButtons.add(jButton10);
        swapParts();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        clickedButtons.add(jButton11);
        swapParts();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        clickedButtons.add(jButton12);
        swapParts();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        clickedButtons.add(jButton13);
        swapParts();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        clickedButtons.add(jButton14);
        swapParts();
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        clickedButtons.add(jButton15);
        swapParts();
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        clickedButtons.add(jButton16);
        swapParts();
    }//GEN-LAST:event_jButton16ActionPerformed

    private static BufferedImage toBufferedImage(Image img) {
        int width = img.getWidth(null);
        int height = img.getHeight(null);
        BufferedImage bufferedImg = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics2D graphic = bufferedImg.createGraphics();
        graphic.drawImage(img, 0, 0, null);
        graphic.dispose();
        return bufferedImg;
    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel faillb;
    private javax.swing.JLabel highscorelb;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton mixUp;
    private javax.swing.JLabel scorelb;
    private javax.swing.JLabel usernamelb;
    // End of variables declaration//GEN-END:variables
}
