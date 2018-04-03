/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proj;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.filechooser.FileFilter;

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 *
 * @author Andre Ammuyutan
 */
public class Mainform extends javax.swing.JFrame {
    InputStream music;
    static Clip clip;
    static long clipTime;
    boolean state;
    Action click;
    static int volume = -20;
//    static boolean isPressed = false;
    
    public Mainform() {
        initComponents();
        
        
        
       snareActionKeyBind();
       bassActionKeyBind();
       floorTomActionKeyBind();
       hihatActionKeyBind();
       rackTomActionKeyBind();
       crashActionKeyBind();
       middleTomActionKeyBind();
       rideActionKeyBind();
       
       
       hihatSettings();
       snareDrumSettings();
       bassDrumSettings();
       floorTomSettings();
       rackTomSettings();
       middleTomSettings();
       rideCymbalSettings();
       
       btnPlay.setVisible(false);
       btnStop.setVisible(false);
       btnVolumeUp.setVisible(false);
       btnVolumeDown.setVisible(false);
       lblSong.setVisible(false);
       
       
      
        
        
    }

    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnMiddleTom = new javax.swing.JButton();
        btnRideCymbal = new javax.swing.JButton();
        btnHihat = new javax.swing.JButton();
        btnSnareDrum = new javax.swing.JButton();
        btnFloorTom = new javax.swing.JButton();
        btnBassDrum = new javax.swing.JButton();
        btnCrashCymbal = new javax.swing.JButton();
        btnRackTom = new javax.swing.JButton();
        btnBrowse = new javax.swing.JButton();
        btnPlay = new javax.swing.JButton();
        btnStop = new javax.swing.JButton();
        btnVolumeDown = new javax.swing.JButton();
        btnVolumeUp = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lblSong = new javax.swing.JLabel();
        lblInterface = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMiddleTom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/middleTomIcon.png"))); // NOI18N
        btnMiddleTom.setBorderPainted(false);
        btnMiddleTom.setContentAreaFilled(false);
        btnMiddleTom.setFocusable(false);
        btnMiddleTom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMiddleTomActionPerformed(evt);
            }
        });
        getContentPane().add(btnMiddleTom, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 190, 110, 60));

        btnRideCymbal.setBorderPainted(false);
        btnRideCymbal.setContentAreaFilled(false);
        btnRideCymbal.setFocusable(false);
        btnRideCymbal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRideCymbalActionPerformed(evt);
            }
        });
        getContentPane().add(btnRideCymbal, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 130, 250, 170));

        btnHihat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hihatIcon.png"))); // NOI18N
        btnHihat.setContentAreaFilled(false);
        btnHihat.setFocusable(false);
        btnHihat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHihatActionPerformed(evt);
            }
        });
        getContentPane().add(btnHihat, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 130, 70));

        btnSnareDrum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/kulayyy.png"))); // NOI18N
        btnSnareDrum.setFocusable(false);
        btnSnareDrum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSnareDrumActionPerformed(evt);
            }
        });
        getContentPane().add(btnSnareDrum, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 430, 100, 70));

        btnFloorTom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/floorTomIcon.png"))); // NOI18N
        btnFloorTom.setFocusable(false);
        btnFloorTom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFloorTomActionPerformed(evt);
            }
        });
        getContentPane().add(btnFloorTom, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 390, 150, 70));

        btnBassDrum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bassDrumIcon.png"))); // NOI18N
        btnBassDrum.setFocusable(false);
        btnBassDrum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBassDrumActionPerformed(evt);
            }
        });
        getContentPane().add(btnBassDrum, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 490, 150, 70));

        btnCrashCymbal.setBorderPainted(false);
        btnCrashCymbal.setContentAreaFilled(false);
        btnCrashCymbal.setFocusable(false);
        btnCrashCymbal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrashCymbalActionPerformed(evt);
            }
        });
        getContentPane().add(btnCrashCymbal, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 190, 60));

        btnRackTom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rackTomIcon.png"))); // NOI18N
        btnRackTom.setContentAreaFilled(false);
        btnRackTom.setFocusable(false);
        btnRackTom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRackTomActionPerformed(evt);
            }
        });
        getContentPane().add(btnRackTom, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, 90, 50));

        btnBrowse.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBrowse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/browseIcon.png"))); // NOI18N
        btnBrowse.setBorderPainted(false);
        btnBrowse.setFocusable(false);
        btnBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseActionPerformed(evt);
            }
        });
        getContentPane().add(btnBrowse, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 60, 60));

        btnPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pauseIcon.png"))); // NOI18N
        btnPlay.setBorderPainted(false);
        btnPlay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPlayMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnPlayMousePressed(evt);
            }
        });
        btnPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayActionPerformed(evt);
            }
        });
        getContentPane().add(btnPlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 10, 64, 64));

        btnStop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/stopIcon.png"))); // NOI18N
        btnStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopActionPerformed(evt);
            }
        });
        getContentPane().add(btnStop, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 10, 64, 64));

        btnVolumeDown.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/vDownIcon.png"))); // NOI18N
        btnVolumeDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolumeDownActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolumeDown, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 10, 64, 64));

        btnVolumeUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/vUpIcon.png"))); // NOI18N
        btnVolumeUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolumeUpActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolumeUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 10, 64, 64));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/if_arrow-back_216437.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, 60));

        lblSong.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblSong.setForeground(new java.awt.Color(255, 255, 255));
        lblSong.setText("label1");
        getContentPane().add(lblSong, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, -1, -1));

        lblInterface.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/interface5.png"))); // NOI18N
        getContentPane().add(lblInterface, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1160, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    
    public void snareDrumSettings(){
        
        btnSnareDrum.setContentAreaFilled(false);
        btnSnareDrum.setBorderPainted(false);
        
        
        
        new Thread(){
            public void run(){
               while(true){
                if(btnSnareDrum.getModel().isPressed() == true) {
                    btnSnareDrum.setIcon(new ImageIcon("C:\\Users\\Andre\\Documents\\Java Specialization\\CS182P\\AudioSync\\src\\images\\snareDrumIcon2.png"));
                }
                else{
                    btnSnareDrum.setIcon(new ImageIcon("C:\\Users\\Andre\\Documents\\Java Specialization\\CS182P\\AudioSync\\src\\images\\kulayyy.png"));    
                }
               }
            }
            
        }.start();
    }
    
    public void bassDrumSettings(){
        btnBassDrum.setContentAreaFilled(false);
        btnBassDrum.setBorderPainted(false);
        
        
        
        new Thread(){
            public void run(){
                while(true){
                if(btnBassDrum.getModel().isPressed()){
                   
                     btnBassDrum.setIcon(new ImageIcon("C:\\Users\\Andre\\Documents\\Java Specialization\\CS182P\\AudioSync\\src\\images\\bassDrumIcon.png"));
                }
                else{
                     btnBassDrum.setIcon(new ImageIcon("C:\\Users\\Andre\\Documents\\Java Specialization\\CS182P\\AudioSync\\src\\images\\bassDrumIcon2.png"));
                    
                }
                
                }
            }
        }.start();
    }
     public void floorTomSettings(){
        btnFloorTom.setContentAreaFilled(false);
        btnFloorTom.setBorderPainted(false);
        
        
        
        new Thread(){
            public void run(){
                while(true){
                
               if(btnFloorTom.getModel().isPressed()){
                   
                    btnFloorTom.setIcon(new ImageIcon("C:\\Users\\Andre\\Documents\\Java Specialization\\CS182P\\AudioSync\\src\\images\\floorTomIcon2.png"));
                }
               else {
                   btnFloorTom.setIcon(new ImageIcon("C:\\Users\\Andre\\Documents\\Java Specialization\\CS182P\\AudioSync\\src\\images\\floorTomIcon.png"));
                }
                }
            }
        }.start();
    }
    
     public void hihatSettings(){
        btnHihat.setContentAreaFilled(false);
        btnHihat.setBorderPainted(false);
    } 
     
     public void rideCymbalSettings(){
        btnRideCymbal.setContentAreaFilled(false);
        btnRideCymbal.setBorderPainted(false);
    } 
     
      public void rackTomSettings(){
        btnRackTom.setContentAreaFilled(false);
        btnRackTom.setBorderPainted(false);
        
        
        
        new Thread(){
            public void run(){
                while(true){
                if(btnRackTom.getModel().isPressed()){
                   btnRackTom.setIcon(new ImageIcon("C:\\Users\\Andre\\Documents\\Java Specialization\\CS182P\\AudioSync\\src\\images\\rackTomIcon2.png"));
                }
                //else if(btnRackTom.getModel().isPressed() == true){
                //    btnRackTom.setIcon(new ImageIcon("C:\\Users\\AMMUYUTAN\\Documents\\Java Specialization\\CS182P\\AudioSync\\src\\images\\gray.png"));
                //}
                else{
                    btnRackTom.setIcon(new ImageIcon("C:\\Users\\Andre\\Documents\\Java Specialization\\CS182P\\AudioSync\\src\\images\\rackTomIcon.png"));
                }
                }
            }
        }.start();
    }
     public void middleTomSettings(){
        btnMiddleTom.setContentAreaFilled(false);
        btnMiddleTom.setBorderPainted(false);
               
        new Thread(){
            public void run(){
                while(true){
                if(btnMiddleTom.getModel().isPressed()){
                   btnMiddleTom.setIcon(new ImageIcon("C:\\Users\\Andre\\Documents\\Java Specialization\\CS182P\\AudioSync\\src\\images\\middleTomIcon2.png"));
                }
                
                else{
                    btnMiddleTom.setIcon(new ImageIcon("C:\\Users\\Andre\\Documents\\Java Specialization\\CS182P\\AudioSync\\src\\images\\middleTomIcon.png"));
                }
                }
            }
        }.start();
    }  
      
     
     
     
     
    public void rackTomActionKeyBind(){
        Action rackTomAction = new AbstractAction(){
        public void actionPerformed(ActionEvent e){
           btnRackTom.doClick(20);
           
           
        }
        };
      
        InputMap inputMap = btnRackTom.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        inputMap.put(KeyStroke.getKeyStroke("D"), "hitRackTom");
        btnRackTom.getActionMap().put("hitRackTom", rackTomAction);
        
    }
    
    
     public void snareActionKeyBind(){
        Action snareAction = new AbstractAction(){
        public void actionPerformed(ActionEvent e){
           btnSnareDrum.doClick(20);
           
           
        }
        };
      
        InputMap inputMap = btnSnareDrum.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        inputMap.put(KeyStroke.getKeyStroke("E"), "hitSnareDrum");
        btnSnareDrum.getActionMap().put("hitSnareDrum", snareAction);
        
    }
     
     public void bassActionKeyBind(){
        Action bassAction = new AbstractAction(){
        public void actionPerformed(ActionEvent e){
           btnBassDrum.doClick(20);
           
           
        }
        };
      
        InputMap inputMap = btnBassDrum.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        inputMap.put(KeyStroke.getKeyStroke("B"), "hitBassDrum");
        btnBassDrum.getActionMap().put("hitBassDrum", bassAction);
        
    }
     
    public void floorTomActionKeyBind(){
        Action floorTomAction = new AbstractAction(){
        public void actionPerformed(ActionEvent e){
           btnFloorTom.doClick(20);
           
           
        }
        };
      
        InputMap inputMap = btnFloorTom.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        inputMap.put(KeyStroke.getKeyStroke("G"), "hitFloorTom");
        btnFloorTom.getActionMap().put("hitFloorTom", floorTomAction);
        
    }  
    
    public void hihatActionKeyBind(){
        Action hihatAction = new AbstractAction(){
        public void actionPerformed(ActionEvent e){
           btnHihat.doClick(20);
           
           
        }
        };
      
        InputMap inputMap = btnHihat.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        inputMap.put(KeyStroke.getKeyStroke("A"), "hitHihat");
        btnHihat.getActionMap().put("hitHihat", hihatAction);
        
    }  
    
    public void crashActionKeyBind(){
        Action crashAction = new AbstractAction(){
        public void actionPerformed(ActionEvent e){
           btnCrashCymbal.doClick(20);
           
           
        }
        };
      
        InputMap inputMap = btnCrashCymbal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        inputMap.put(KeyStroke.getKeyStroke("T"), "hitCrash");
        btnCrashCymbal.getActionMap().put("hitCrash", crashAction);
        
    }
    
    public void rideActionKeyBind(){
        Action rideAction = new AbstractAction(){
        public void actionPerformed(ActionEvent e){
           btnRideCymbal.doClick(20);
           
           
        }
        };
      
        InputMap inputMap = btnRideCymbal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        inputMap.put(KeyStroke.getKeyStroke("U"), "hitRide");
        btnRideCymbal.getActionMap().put("hitRide", rideAction);
        
    }
    
    public void middleTomActionKeyBind(){
        Action middleTomAction = new AbstractAction(){
        public void actionPerformed(ActionEvent e){
           btnMiddleTom.doClick(20);
           
           
        }
        };
      
        InputMap inputMap = btnMiddleTom.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        inputMap.put(KeyStroke.getKeyStroke("F"), "hitMiddleTom");
        btnMiddleTom.getActionMap().put("hitMiddleTom", middleTomAction);
        
    }
    
    
    
    
    private void btnSnareDrumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSnareDrumActionPerformed
        
       
        
        try {
            music=new FileInputStream(new File(Sound.snareSound));
            AudioStream audios=new AudioStream(music);
            AudioPlayer.player.start(audios);
        } catch (Exception ex) {
            Logger.getLogger(FreePlayForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSnareDrumActionPerformed

    private void btnBassDrumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBassDrumActionPerformed
        
        try {
            music=new FileInputStream(new File(Sound.bassSound));
            AudioStream audios=new AudioStream(music);
            AudioPlayer.player.start(audios);
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_btnBassDrumActionPerformed

    private void btnFloorTomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFloorTomActionPerformed
        try {
            music=new FileInputStream(new File("C:\\Users\\Andre\\Documents\\Java Specialization\\CS182P\\AudioSync\\src\\sound\\tf4.wav"));
            AudioStream audios=new AudioStream(music);
            AudioPlayer.player.start(audios);
        } catch (Exception ex) {
             System.out.println(ex.toString());
        }
    }//GEN-LAST:event_btnFloorTomActionPerformed

    private void btnHihatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHihatActionPerformed
        try {
            music=new FileInputStream(new File(Sound.hihatSound));
            AudioStream audios=new AudioStream(music);
            AudioPlayer.player.start(audios);
        } catch (Exception ex) {
             System.out.println(ex.toString());
        }
    }//GEN-LAST:event_btnHihatActionPerformed

    private void btnRackTomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRackTomActionPerformed
        try {
            music=new FileInputStream(new File("C:\\Users\\Andre\\Documents\\Java Specialization\\CS182P\\AudioSync\\src\\sound\\ta1.wav"));
            AudioStream audios=new AudioStream(music);
            AudioPlayer.player.start(audios);
        } catch (Exception ex) {
             System.out.println(ex.toString());
        }
    }//GEN-LAST:event_btnRackTomActionPerformed

    private void btnMiddleTomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMiddleTomActionPerformed
        try {
            music=new FileInputStream(new File("C:\\Users\\Andre\\Documents\\Java Specialization\\CS182P\\AudioSync\\src\\sound\\ta2.wav"));
            AudioStream audios=new AudioStream(music);
            AudioPlayer.player.start(audios);
        } catch (Exception ex) {
             System.out.println(ex.toString());
        }
    }//GEN-LAST:event_btnMiddleTomActionPerformed

    private void btnCrashCymbalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrashCymbalActionPerformed
        try {
            music=new FileInputStream(new File(Sound.crashSound));
            AudioStream audios=new AudioStream(music);
            AudioPlayer.player.start(audios);
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_btnCrashCymbalActionPerformed

    private void btnBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseActionPerformed
       
        AudioStream as;
        InputStream in;
        JFileChooser fileChooser = new JFileChooser();
        FileFilter wavFilter = new FileFilter() {
			@Override
			public String getDescription() {
				return "Sound file (*.WAV)";
			}

			@Override
			public boolean accept(File file) {
				if (file.isDirectory()) {
					return true;
				} else {
					return file.getName().toLowerCase().endsWith(".wav");
				}
			}
		};
        fileChooser.setFileFilter(wavFilter);
        fileChooser.setDialogTitle("Open Audio File");
	fileChooser.setAcceptAllFileFilterUsed(false);
        fileChooser.setCurrentDirectory(new File("C:\\Users\\AMMUYUTAN\\Documents\\Java Specialization\\CS182P\\AudioSync\\src\\sound\\Songs"));
        int returnVal = fileChooser.showOpenDialog(getParent());
        if(returnVal == JFileChooser.APPROVE_OPTION) {
        System.out.println("You chose to open this file: " + fileChooser.getSelectedFile().getName());

        lblSong.setText("Now Playing: " + fileChooser.getSelectedFile().getName());
        lblSong.setVisible(true);
        playSong(fileChooser.getSelectedFile());
        btnPlay.setVisible(true);
        btnStop.setVisible(true);
        btnVolumeUp.setVisible(true);
        btnVolumeDown.setVisible(true);
        btnBrowse.setVisible(false);
        }
    }//GEN-LAST:event_btnBrowseActionPerformed

    private void btnPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayActionPerformed
        clipTime = clip.getMicrosecondPosition();
        
         if (state == false){
                btnPlay.setIcon(new ImageIcon("C:\\Users\\AMMUYUTAN\\Documents\\Java Specialization\\CS182P\\AudioSync\\src\\images\\playIcon.png"));
                state = true;
                clip.stop();
                
            }
                    else if (state == true){
                        btnPlay.setIcon(new ImageIcon("C:\\Users\\AMMUYUTAN\\Documents\\Java Specialization\\CS182P\\AudioSync\\src\\images\\pauseIcon.png"));
                        state = false;
                        clip.setMicrosecondPosition(clipTime);
                        System.out.println(clipTime);
                        clip.start();
                    }
       
        
    }//GEN-LAST:event_btnPlayActionPerformed

    private void btnPlayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPlayMouseClicked
       
    }//GEN-LAST:event_btnPlayMouseClicked

    private void btnPlayMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPlayMousePressed
       
    }//GEN-LAST:event_btnPlayMousePressed

    private void btnStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStopActionPerformed
       //btnPlay.setIcon(new ImageIcon("C:\\Users\\AMMUYUTAN\\Documents\\Java Specialization\\CS182P\\AudioSync\\src\\images\\playIcon.png"));
       btnPlay.setVisible(false);
       btnStop.setVisible(false);
       btnVolumeUp.setVisible(false);
       btnVolumeDown.setVisible(false);
       btnBrowse.setVisible(true);
       
        clipTime = 000000;
        clip.setMicrosecondPosition(clipTime);
        clip.stop();
        
        lblSong.setVisible(false);
    }//GEN-LAST:event_btnStopActionPerformed

    private void btnVolumeUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolumeUpActionPerformed
        volume += 2; 
        FloatControl gainControl = 
           (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
            gainControl.setValue(volume);
            
            System.out.println(volume);
            
            if(volume> -80) {
            
            btnVolumeDown.setVisible(true);
            
        }
            
            if(volume >= 6) {
                
                JOptionPane.showMessageDialog(this, "You've reached the maximum volume!");
                btnVolumeUp.setVisible(false);
                
            }
            
    }//GEN-LAST:event_btnVolumeUpActionPerformed

    private void btnVolumeDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolumeDownActionPerformed
        volume -= 2;
        FloatControl gainControl = 
        (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
        gainControl.setValue(volume);
         
        System.out.println(volume);
        
        if( volume <= -80 ) {
            
            JOptionPane.showMessageDialog(this, "You've reached the minimum volume!");
            btnVolumeDown.setVisible(false);
            
        }
        
        if(volume < 7) {
                
            btnVolumeUp.setVisible(true);
                
        }
       
    }//GEN-LAST:event_btnVolumeDownActionPerformed

    private void btnRideCymbalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRideCymbalActionPerformed
        try {
            music=new FileInputStream(new File(Sound.rideSound));
            AudioStream audios=new AudioStream(music);
            AudioPlayer.player.start(audios);
        } catch (Exception ex) {
            Logger.getLogger(Mainform.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRideCymbalActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(clip!=null){
            clip.stop();
        }
        new WelcomePage().setVisible(true);
         this.setVisible(false);
         
    }//GEN-LAST:event_jButton2ActionPerformed
    
    public void playSong(File song){
    new Thread(){
        
        public void run(){
        
        try{
            clip =  AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(song));
            FloatControl gainControl = 
           (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
            gainControl.setValue(-20);
            clip.start();
           // clipTime = clip.getMicrosecondPosition();
            
            Thread.sleep(clip.getMicrosecondLength()/1000);
        }
        
        catch(Exception e){
            System.out.println(e.toString());
        
        }
        }
    }.start();
        
    }
    
    
    
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mainform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBassDrum;
    private javax.swing.JButton btnBrowse;
    private javax.swing.JButton btnCrashCymbal;
    private javax.swing.JButton btnFloorTom;
    private javax.swing.JButton btnHihat;
    private javax.swing.JButton btnMiddleTom;
    private javax.swing.JButton btnPlay;
    private javax.swing.JButton btnRackTom;
    private javax.swing.JButton btnRideCymbal;
    private javax.swing.JButton btnSnareDrum;
    private javax.swing.JButton btnStop;
    private javax.swing.JButton btnVolumeDown;
    private javax.swing.JButton btnVolumeUp;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel lblInterface;
    private javax.swing.JLabel lblSong;
    // End of variables declaration//GEN-END:variables
}
