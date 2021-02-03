/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

import java.awt.Frame;
import java.util.Random;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author John
 */
public class GUI extends javax.swing.JFrame {
    
    private ArrayList<String> word_list = new ArrayList(); // Οι λέξεις που έχουμε κάνει hardcode
    private Random randomizer = new Random(); // Αντικείμενο Random για την τυχαία επιλογή
    private String random; // Η τυχαία λέξη που θα επιλεχθεί
    private ArrayList<String> letters_used = new ArrayList(); // Τα γράμματα που χρησιμοποιήθηκαν
    private String word_underscored; // Η λέξη που έχει αντικατασταθεί από "_"
    int guesses_left; // Οι προσπάθειες που έμειναν
    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        create_game(); // Εκκίνηση παιχνιδιού
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        letter_text = new javax.swing.JTextField();
        letter_check_btn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        used_letter_list_label = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        word_label = new javax.swing.JLabel();
        exit_button = new javax.swing.JButton();
        new_btn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        guesses_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ΚΡΕΜΑΛΑ");

        jLabel2.setText("Δώσε ένα γράμμα:");

        letter_text.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                letter_textKeyTyped(evt);
            }
        });

        letter_check_btn.setText("Έλεγχος γράμματος");
        letter_check_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letter_check_btnActionPerformed(evt);
            }
        });

        jLabel3.setText("Χρησιμοποιημένα γράμματα:");

        jLabel5.setText("Λέξη:");

        exit_button.setText("Έξοδος");
        exit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_buttonActionPerformed(evt);
            }
        });

        new_btn.setText("Νέα παρτίδα");
        new_btn.setEnabled(false);
        new_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_btnActionPerformed(evt);
            }
        });

        jLabel4.setText("Εναπομείνασες προσπάθειες:");

        guesses_label.setText("jLabel6");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(new_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exit_button, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(letter_text, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(letter_check_btn))
                    .addComponent(used_letter_list_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(guesses_label, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4))
                    .addComponent(word_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(letter_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letter_check_btn))
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(used_letter_list_label, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(guesses_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(word_label, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exit_button)
                    .addComponent(new_btn))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Κουμπί εξόδου
    private void exit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_buttonActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_exit_buttonActionPerformed

    private void letter_textKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_letter_textKeyTyped
        // TODO add your handling code here:
        if (evt.getKeyChar()>= 'Α' && evt.getKeyChar()<='ω' && letter_text.getText().length()<1){
            // Έλεγχος αν το πεδίο που εισάγει το γράμμα το χρήστης έχει ελληνικό χαρακτήρα ή εάν περιέχει ένα ή κανένα γράμμα
        }
        else {
            evt.consume(); // αν όχι δεν πληκτρολογείτε τίποτε
        }
    }//GEN-LAST:event_letter_textKeyTyped

    // Πάτημα κουμπιού ελέγχου γράμματος
    private void letter_check_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letter_check_btnActionPerformed
        // TODO add your handling code here:
        String letter = letter_text.getText().toUpperCase(); // κάνουμε το γράμμα κεφαλαίο ώστε να γίνει σωστή σύγκριση
        if (letter.length()<=0) { // Εάν το πεδίο γράμματος ήταν κενό τότε βγάζει μήνυμα
            Frame frame = new Frame();            
            JOptionPane.showMessageDialog(frame, "Εισάγετε ένα γράμμα");
        }
        else if (letters_used.contains(letter)) { // Εάν το γράμμα έχει ήδη χρησιμοποιηθεί βγάζει μήνυμα
            Frame frame = new Frame();            
            JOptionPane.showMessageDialog(frame, "Έχετε ήδη χρησιμοποιήσει το γράμμα \"" + letter + "\"!");
            letter_text.setText(String.valueOf(""));
        }
        else { // Εάν είναι νέο γράμμα προχωράει
            if (!random.contains(letter)) { // Εάν δεν το περιέχει η λέξη
                guesses_left--; // Αφαιρούμε μία προσπάθια
                guesses_label.setText(String.valueOf(guesses_left)); // Τις εμφανιζουμε στο παράθυρο
                Frame frame = new Frame();            
                JOptionPane.showMessageDialog(frame, "Το γράμμα " + letter + " δεν υπάρχει στη λέξη!"); // και βγάζει μήνυμα
            }
            else { // Εάν υπάρχει το γράμμα
                ArrayList<Integer> letter_positions = new ArrayList(); // Βρίσκουμε σε ποιες θέσεις της λέξης βρίσκονται
		int i = random.indexOf(letter);
                while(i != -1) {
                    letter_positions.add(i);
                    i = random.indexOf(letter, i+1);
                }
                Frame frame = new Frame();            
                JOptionPane.showMessageDialog(frame, "Υπάρχουν " + letter_positions.size() + " \"" + letter + "\" στη λέξη!");
                revealLetters(letter_positions, letter); // Και περνάμε τις θέσης και το γράμμα στην μέθοδο ώστε να αποκαλυφθούν τα γράμματα
            }
            letters_used.add(letter); // προσθέτουμε το γράμμα στα χρησιμοποιημένα
            String result = String.join(", ", letters_used); // τα κάνουμε ένα ενιαίο String
            used_letter_list_label.setText(String.valueOf(result)); // Εμφανίζουμε/Ανανεώνουμε τα χρησιμοποιημένα γράμματα στο παράθυρο
            letter_text.setText(String.valueOf("")); // Αδιάζουμε το πεδίο που τοποθετεί ο χρήστης τα γράμματα
            if (!word_underscored.contains("_") || guesses_left == 0) { // Ελέγχουμε αν ο χρήστης έχει βρει όλα τα γράμματα ή τελείωσαν οι προσπάθειες
                letter_check_btn.setEnabled(false);
                letter_text.setEnabled(false); // Απενεργοποιούμε το πεδίο εισαγωγής και το κουμπί ελέγχου
                new_btn.setEnabled(true); // Ενεργοποιούμε την επανεκκίνηση του παιχνιδιού
                Frame frame = new Frame();
                if (!word_underscored.contains("_")) // Εάν η "κρυμμένη" λέξη δεν περιέχει άλλα "_" ο παίκτης κέρδισε
                    JOptionPane.showMessageDialog(frame, "Συγχαρητήρια! Βρήκατε τη λέξη!");
                else // Αλλιώς έχασε
                    JOptionPane.showMessageDialog(frame, "Λυπάμαι, χάσατε!");
            }
        }
    }//GEN-LAST:event_letter_check_btnActionPerformed

    //Κουμπί επανεκκίνησης
    private void new_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_btnActionPerformed
        // TODO add your handling code here:
        create_game(); // Καλέι τη μέθοδο δημιουργίας παιχνιδιού
        letter_check_btn.setEnabled(true); // Και ενεργοποιεί/απενεργοποιεί τα σχετικά κουμπιά
        letter_text.setEnabled(true);
        new_btn.setEnabled(false);
        
    }//GEN-LAST:event_new_btnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exit_button;
    private javax.swing.JLabel guesses_label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton letter_check_btn;
    private javax.swing.JTextField letter_text;
    private javax.swing.JButton new_btn;
    private javax.swing.JLabel used_letter_list_label;
    private javax.swing.JLabel word_label;
    // End of variables declaration//GEN-END:variables
    
    // Μέθοδος επιλογής μιας τυχαίας λέξης
    private String createRandomWord(){
        word_list.add("ΕΞΕΤΑΣΗ"); 
        word_list.add("ΠΙΣΤΟΠΟΙΗΣΗ"); 
        word_list.add("ΕΠΑΓΓΕΛΜΑ");
        word_list.add("ΑΝΤΙΚΕΙΜΕΝΟ"); 
        word_list.add("ΚΑΡΑΝΤΙΝΑ");
        return word_list.get(randomizer.nextInt(word_list.size()));
    }
    
    // Μετατροπή της τυχαίας λέξης σε κρυφή με τη χρήση "_"
    private String createUnderscores(String random){
        int length = random.length();
        String word_underscored = "";
        for (int i=0; i<length; i++){
            word_underscored += "_";
        }
        return word_underscored;
    }
    
    // Μέθοδος αποκάλυχης των γραμμάτων
    // Χρησιμοποιεί τα indices και το γράμμα ώστε να αντικαταστήσει τα _ με το γράμμα στις κατάλληλες θέσεις
    private void revealLetters(ArrayList<Integer> indices, String letter) {
        for (Integer index : indices) {
            word_underscored = word_underscored.substring(0, index) + letter + word_underscored.substring(index + 1);
        }
        word_label.setText(String.valueOf(word_underscored));
    }

    // Μέθοδος δημιουργίας παιχνιδιού, αρχικοποιεί όλες τις τιμές
    private void create_game() {
        random = createRandomWord();
        word_underscored = createUnderscores(random);
        guesses_left = 6;
        guesses_label.setText(String.valueOf(guesses_left));
        word_label.setText(String.valueOf(word_underscored));
        letters_used.clear();
        used_letter_list_label.setText(String.valueOf(""));
    }
}
