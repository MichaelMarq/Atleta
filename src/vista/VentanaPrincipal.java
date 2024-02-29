
package vista;

import javax.swing.JOptionPane;
import modelo.Atleta;


public class VentanaPrincipal extends javax.swing.JFrame {


    public VentanaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLNombre = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        jLEdad = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLPeso = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        txtEstatura = new javax.swing.JTextField();
        jLEstatura = new javax.swing.JLabel();
        btnGuardarAtleta = new javax.swing.JButton();
        barraMenu = new javax.swing.JMenuBar();
        menu = new javax.swing.JMenu();
        mostrarAtletas = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        salir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro de Atletas");

        panel.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registro");

        jLNombre.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLNombre.setForeground(new java.awt.Color(255, 255, 255));
        jLNombre.setText("Nombre:");

        txtPeso.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLEdad.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLEdad.setForeground(new java.awt.Color(255, 255, 255));
        jLEdad.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLEdad.setText("Edad:");
        jLEdad.setMaximumSize(new java.awt.Dimension(92, 28));

        txtNombre.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLPeso.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLPeso.setForeground(new java.awt.Color(255, 255, 255));
        jLPeso.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLPeso.setText("Peso (kg):");

        txtEdad.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        txtEstatura.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLEstatura.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLEstatura.setForeground(new java.awt.Color(255, 255, 255));
        jLEstatura.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLEstatura.setText("Estatura (cm):");

        btnGuardarAtleta.setBackground(new java.awt.Color(102, 102, 255));
        btnGuardarAtleta.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnGuardarAtleta.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarAtleta.setText("Registrar Atleta");
        btnGuardarAtleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarAtletaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLPeso)
                    .addComponent(jLEstatura)
                    .addComponent(jLEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLNombre))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEstatura, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardarAtleta)
                .addGap(225, 225, 225))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(46, 46, 46)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLNombre))
                        .addGap(48, 48, 48))
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLPeso))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLEstatura)
                    .addComponent(txtEstatura, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(btnGuardarAtleta)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        menu.setText("Menú");
        menu.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        mostrarAtletas.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        mostrarAtletas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/run.png"))); // NOI18N
        mostrarAtletas.setText("Mostrar atletas registrados");
        menu.add(mostrarAtletas);
        menu.add(jSeparator1);

        salir.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salir.png"))); // NOI18N
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        menu.add(salir);

        barraMenu.add(menu);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void btnGuardarAtletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarAtletaActionPerformed
        String nombre;
        int edad, estatura;
        double peso;
        
        try{
            nombre = txtNombre.getText();
            edad= Integer.parseInt(txtEdad.getText());
            peso = Double.parseDouble(txtPeso.getText());
            estatura = Integer.parseInt(txtEstatura.getText());
            
            Atleta atleta = new Atleta(nombre, edad, peso, estatura);
            
            escribirBinario(atleta);
            JOptionPane.showMessageDialog(null, "Atleta guardado con exito");
            
            restablecerCampos();
            
        }catch(NumberFormatException d){
            JOptionPane.showMessageDialog(null, "Dato ingresado incorrecto", "alert", JOptionPane.WARNING_MESSAGE);
            
        }

        
    }//GEN-LAST:event_btnGuardarAtletaActionPerformed

    private void restablecerCampos(){
        txtNombre.setText("");
        txtEdad.setText("");
        txtPeso.setText("");
        txtEstatura.setText("");      
    }
    
    private void escribirBinario(Atleta atleta){
        
    }
    
    

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JButton btnGuardarAtleta;
    private javax.swing.JLabel jLEdad;
    private javax.swing.JLabel jLEstatura;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLPeso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu menu;
    private javax.swing.JMenuItem mostrarAtletas;
    private javax.swing.JPanel panel;
    private javax.swing.JMenuItem salir;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEstatura;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPeso;
    // End of variables declaration//GEN-END:variables
}
