/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlac;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kiOo1
 */
public class vista extends javax.swing.JFrame {

    /**
     * Creates new form vista
     */
    
    conexionBD comm = new conexionBD();
    Connection conexion = comm.conec_base_de_datos();

    DefaultTableModel modelo;
    
    
    
      
        
       /* DefaultTableModel interfaz;
    String  data [][]={};
    String  cabeza []={"FechaIni","HoraComi","Actividad","Etapas","inetrupcion","FechaFin"};*/
    
    
    
    public vista() {
      
          initComponents();
          
          setLocationRelativeTo(null);
          t = new Timer(10, acciones);
          t2 = new Timer(10, accione);
          
          datos("");
          
       
        /**
         * instacion de la tabla 
         */
       /* interfaz = new DefaultTableModel(data, cabeza);
        jTable1.setModel(interfaz);*/
        
        
        
    }
    
      public void datos(String Dato) {
         DefaultTableModel Interfaz= new DefaultTableModel();
        Interfaz.addColumn("Id_N");
        Interfaz.addColumn("FechaIni_HoraIni");
        Interfaz.addColumn("Actividad");
        Interfaz.addColumn("Etapas");
        Interfaz.addColumn("Interrupcion");
        Interfaz.addColumn("Fechafin");
        jTable1.setModel(Interfaz);
        String sql="";
        if(Dato.equals(""))
        {
            sql="SELECT * FROM tarea";
        }
        else{
            sql="SELECT * FROM tarea WHERE Actividad='"+Dato+"'";
        }

        String []datos = new String [6];
            try {
                Statement st = conexion.createStatement();
                ResultSet rs = st.executeQuery(sql);
                while(rs.next()){
                    datos[0]=rs.getString(1);
                    datos[1]=rs.getString(2);
                    datos[2]=rs.getString(3);
                    datos[3]=rs.getString(4);
                    datos[4]=rs.getString(5);
                    datos[5]=rs.getString(6);
                    
                    Interfaz.addRow(datos);
                }
                jTable1.setModel(Interfaz);
            } catch (SQLException ex) {
                Logger.getLogger(vista.class.getName()).log(Level.SEVERE, null, ex);
            }

    }    
    
Connection conn;
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txt3 = new javax.swing.JTextField();
        txt4 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        btnStar = new javax.swing.JButton();
        btnPausar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnStop = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnAñadir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        etiquetaTiempo = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        etiquetaT2 = new javax.swing.JLabel();
        intxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel3.setText("Etapas");

        txt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt3ActionPerformed(evt);
            }
        });

        txt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt2ActionPerformed(evt);
            }
        });

        btnStar.setText("Empezar");
        btnStar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStarActionPerformed(evt);
            }
        });

        btnPausar.setText("Pausar");
        btnPausar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPausarActionPerformed(evt);
            }
        });

        jLabel1.setText("actividad ");

        btnStop.setText("Terminar");
        btnStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopActionPerformed(evt);
            }
        });

        jLabel2.setText("Fecha final");

        btnAñadir.setText("añadir");
        btnAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirActionPerformed(evt);
            }
        });

        jLabel4.setText("Nombre");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Tiempo de Actividad");

        etiquetaTiempo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        etiquetaTiempo.setText("00:00:00:00");

        jLabel7.setText("tiempo de imterrupcion");

        etiquetaT2.setText("00:00:00:00");

        intxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                intxtActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setText("Administracion de tiempo en en desarrolo de actividades ");

        jButton1.setText("AgregarHora");

        Eliminar.setText("Eliminar Actividad");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnStar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(etiquetaTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(120, 120, 120)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel7)
                                                    .addComponent(etiquetaT2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnPausar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnStop)
                                                .addGap(46, 46, 46)
                                                .addComponent(intxt, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButton1)
                                                .addGap(74, 74, 74)
                                                .addComponent(Eliminar))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(31, 31, 31)
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)
                                        .addComponent(btnAñadir))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel4)
                                .addGap(27, 27, 27)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel6)))
                        .addGap(0, 92, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAñadir))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(etiquetaTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(etiquetaT2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnStar)
                    .addComponent(btnPausar)
                    .addComponent(btnStop)
                    .addComponent(intxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(Eliminar))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private Timer t;
    private int h,m,s,cs;
    private ActionListener acciones = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
               cs++;
                if (cs==100) {
                    cs=0;
                    ++s;
                }
                if (s==60) {
                    s=0;
                    ++m;
                   
                }
                if (m==60) {
                    m=0;
                    ++h;
                    
                }
                actualizarlabel();
                //obtener_valor();
            }
    
    };
    
     private Timer t2;
   
    private ActionListener accione = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
               cs++;
                if (cs==100) {
                    cs=0;
                    ++s;
                }
                if (s==60) {
                    s=0;
                    ++m;
                   
                }
                if (m==60) {
                    m=0;
                    ++h;
                    
                }
               
               actualizarlabel2();
            }
    
    };
    
    
    //public void obtener_valor(){
        //txt3.setText(String.valueOf(m));
    //}

    private void actualizarlabel(){
        /**
         * 
         * si h = cantidad de horas menor o igual 9
         * h<=9?"0":""
         * se remplazaria por cero sino se remplazara por una cadena vacia
         * agrega un cero cuando el valor sea menor a 9
         * 
         */
        String tiempo=(h<=9?"0":"")+h+":"+(m<=9?"0":"")+m+":"+(s<=9?"0":"")+s+":"+(cs<=9?"0":"")+cs;
        etiquetaTiempo.setText(tiempo);
        
        
        
        //etiquetaT2.setText(tiempo);
    
    
    }
    
    
    private void actualizarlabel2(){
        /**
         * 
         * si h = cantidad de horas menor o igual 9
         * h<=9?"0":""
         * se remplazaria por cero sino se remplazara por una cadena vacia
         * agrega un cero cuando el valor sea menor a 9
         * 
         */
        String tiempo=(h<=9?"0":"")+h+":"+(m<=9?"0":"")+m+":"+(s<=9?"0":"")+s+":"+(cs<=9?"0":"")+cs;
        etiquetaT2.setText(tiempo);
        
        
        
        //etiquetaT2.setText(tiempo);
    
    
    }
    
     
    
    
    private void txt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt3ActionPerformed

    private void txt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt2ActionPerformed

    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed
        // TODO add your handling code here:
        
        
        
        
        
          try 
        {
         

            String sql="INSERT INTO tarea( Actividad ,Etapas,interruccion,  Fechafin) values(?,?,?,?)";
            PreparedStatement psp = conexion.prepareStatement(sql);
            conexion.prepareStatement(sql);
            //psp.setString(1, id_producto.getText());
            
            psp.setString(1, txt2.getText());  
            psp.setString(2, txt4.getText());
            psp.setString(3, intxt.getText());
            psp.setString(4, txt3.getText());
            
            psp.executeUpdate();
            datos("");
            
            
        }
        
        catch (SQLException e)
                {
                    System.out.println(e.getMessage());
                    JOptionPane.showMessageDialog(null, "Error " + e);
                }

        
        
        
        
        
        
        
        
        /*String ac= txt2.getText();
        String ti= txt3.getText();
        String Eta= txt4.getText();
        String fei= txt5.getText();

        String datos[]={fei,ti,ac,Eta};
       // interfaz.addRow(datos);*/

    }//GEN-LAST:event_btnAñadirActionPerformed

    private void btnStarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStarActionPerformed
        //t.stop();
        //h=0;m=0;s=0;cs=0;
        t.start();
        t2.stop();
       
        btnStar.setEnabled(false);
        btnStar.setText("Reanudar");
        btnPausar.setEnabled(true);
        btnStop.setEnabled(true);
       actualizarlabel();
        //actualizarlabel2();
       // obtener_valor();
        
        
    }//GEN-LAST:event_btnStarActionPerformed

    private void btnPausarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPausarActionPerformed
       t.stop();
       
       btnStar.setEnabled(true);
       btnPausar.setEnabled(false);
     //  h=0; m=0;s=0;cs=0;
      // actualizarlabel();
       actualizarlabel2();
       t2.start();
       
    }//GEN-LAST:event_btnPausarActionPerformed

    private void btnStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStopActionPerformed
        if (t.isRunning()) {
            t.stop();
            btnStar.setEnabled(true);
            
        }
        btnStar.setText("iniciar");
        btnPausar.setEnabled(false);
        btnStop.setEnabled(false);
        h=0; m=0; s=0; cs=0;
       
        actualizarlabel();
    }//GEN-LAST:event_btnStopActionPerformed

    private void intxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_intxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_intxtActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
       
        
         int eliminar = jTable1.getSelectedRow();
        String informacion="";
        informacion = jTable1.getValueAt(eliminar, 0).toString();
        
         try {
         
             PreparedStatement eli = conexion.prepareStatement("DELETE FROM tarea WHERE Id_N='"+informacion+"'");
             eli.executeUpdate();
             datos("");
         
              }
              catch (SQLException e)
              {
                  System.out.print(e.getMessage());
              }
                     
        
        
        
        
    }//GEN-LAST:event_EliminarActionPerformed

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
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton btnAñadir;
    private javax.swing.JButton btnPausar;
    private javax.swing.JButton btnStar;
    private javax.swing.JButton btnStop;
    private javax.swing.JLabel etiquetaT2;
    private javax.swing.JLabel etiquetaTiempo;
    private javax.swing.JTextField intxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    private javax.swing.JTextField txt4;
    // End of variables declaration//GEN-END:variables
}
