/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MDI;

import static MDI.mdi_Principal.labelusuario;
import static MDI.mdi_Principal.lbusu;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Angel
 */
public class Cot_Det_Cliente extends javax.swing.JInternalFrame {

    public void get_fecha(){
        //Obtenemos la fecha
        Calendar c1 = Calendar.getInstance();
                fecha.setCalendar(c1);
    }
    
    public void get_usuario(){
        try {
            Connection cn = DriverManager.getConnection(mdi_Principal.BD, mdi_Principal.Usuario, mdi_Principal.Contraseña);
            PreparedStatement pst = cn.prepareStatement("select * from usuario_hoteleria where nombre_usuario = ?");
            pst.setString(1, labelusuario.getText().trim()); 

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {

                lbusu.setText(rs.getString("id_usuario"));
                


        }
        }catch (Exception e) {

        
        }
    }
    
    public void bitacora_guardar(){
        String numero=cbox_CotEncCliente.getSelectedItem().toString().trim();
        String descrip="Ingresó un detalle de cotización correspondiente al encabezado número "+numero;
       //Desciframos la fecha
        java.util.Date fechaN = fecha.getDate();
        long fecha = fechaN.getTime();
        java.sql.Date dateN = new java.sql.Date(fecha);
        
        
        //Obtenemos la hora
                Calendar timec = Calendar.getInstance();
                
                int hora = timec.get(Calendar.HOUR_OF_DAY);
                int minutos = timec.get(Calendar.MINUTE);
                int segundos = timec.get(Calendar.SECOND);
                
                String time=hora+":"+minutos+":"+segundos;
                
        
        try {
            
            Connection cn = DriverManager.getConnection(mdi_Principal.BD, mdi_Principal.Usuario, mdi_Principal.Contraseña);
            //localhost es 127.0.0.1
            PreparedStatement pst = cn.prepareStatement("insert into bitacora values(?,?,?,?,?)");

            pst.setString(1, "0");
            pst.setString(2, lbusu.getText().trim());
            pst.setString(3, descrip);
            pst.setString(4,dateN.toString().trim() );
            pst.setString(5, time.trim());
            
            pst.executeUpdate();

        } catch (SQLException e) {
        }
    }
    public void bitacora_modificar(){
        String numero=cbox_CotEncCliente.getSelectedItem().toString().trim();
        String num=txtbuscado.getText();
        String descrip="Modificó el detalle de cotización número "+num+" correspondiente al encabezado número "+numero;
       //Desciframos la fecha
        java.util.Date fechaN = fecha.getDate();
        long fecha = fechaN.getTime();
        java.sql.Date dateN = new java.sql.Date(fecha);
        
        
        //Obtenemos la hora
                Calendar timec = Calendar.getInstance();
                
                int hora = timec.get(Calendar.HOUR_OF_DAY);
                int minutos = timec.get(Calendar.MINUTE);
                int segundos = timec.get(Calendar.SECOND);
                
                String time=hora+":"+minutos+":"+segundos;
                
        
        try {
            
            Connection cn = DriverManager.getConnection(mdi_Principal.BD, mdi_Principal.Usuario, mdi_Principal.Contraseña);
            //localhost es 127.0.0.1
            PreparedStatement pst = cn.prepareStatement("insert into bitacora values(?,?,?,?,?)");

            pst.setString(1, "0");
            pst.setString(2, lbusu.getText().trim());
            pst.setString(3, descrip);
            pst.setString(4,dateN.toString().trim() );
            pst.setString(5, time.trim());
            
            pst.executeUpdate();

        } catch (SQLException e) {
        }
    }
    public void bitacora_eliminar(){
        String numero=cbox_CotEncCliente.getSelectedItem().toString().trim();
        String num=txtbuscado.getText();
        String descrip="Eliminó el detalle de cotización número "+num+" correspondiente al encabezado número "+numero;
       //Desciframos la fecha
        java.util.Date fechaN = fecha.getDate();
        long fecha = fechaN.getTime();
        java.sql.Date dateN = new java.sql.Date(fecha);
        
        
        //Obtenemos la hora
                Calendar timec = Calendar.getInstance();
                
                int hora = timec.get(Calendar.HOUR_OF_DAY);
                int minutos = timec.get(Calendar.MINUTE);
                int segundos = timec.get(Calendar.SECOND);
                
                String time=hora+":"+minutos+":"+segundos;
                
        
        try {
            
            Connection cn = DriverManager.getConnection(mdi_Principal.BD, mdi_Principal.Usuario, mdi_Principal.Contraseña);
            //localhost es 127.0.0.1
            PreparedStatement pst = cn.prepareStatement("insert into bitacora values(?,?,?,?,?)");

            pst.setString(1, "0");
            pst.setString(2, lbusu.getText().trim());
            pst.setString(3, descrip);
            pst.setString(4,dateN.toString().trim() );
            pst.setString(5, time.trim());
            
            pst.executeUpdate();

        } catch (SQLException e) {
        }
    }
    public void bitacora_buscar(){
        String numero=cbox_CotEncCliente.getSelectedItem().toString().trim();
        String num=txtbuscado.getText();
        String descrip="Buscó el detalle de cotización número "+num+" correspondiente al encabezado número "+numero;
       //Desciframos la fecha
        java.util.Date fechaN = fecha.getDate();
        long fecha = fechaN.getTime();
        java.sql.Date dateN = new java.sql.Date(fecha);
        
        
        //Obtenemos la hora
                Calendar timec = Calendar.getInstance();
                
                int hora = timec.get(Calendar.HOUR_OF_DAY);
                int minutos = timec.get(Calendar.MINUTE);
                int segundos = timec.get(Calendar.SECOND);
                
                String time=hora+":"+minutos+":"+segundos;
                
        
        try {
            
            Connection cn = DriverManager.getConnection(mdi_Principal.BD, mdi_Principal.Usuario, mdi_Principal.Contraseña);
            //localhost es 127.0.0.1
            PreparedStatement pst = cn.prepareStatement("insert into bitacora values(?,?,?,?,?)");

            pst.setString(1, "0");
            pst.setString(2, lbusu.getText().trim());
            pst.setString(3, descrip);
            pst.setString(4,dateN.toString().trim() );
            pst.setString(5, time.trim());
            
            pst.executeUpdate();

        } catch (SQLException e) {
        }
    }
    /**
     * Creates new form Cot_Det_Cliente
     */
    
    public void tablas() {
        try {
            
            Connection cn = DriverManager.getConnection(mdi_Principal.BD, mdi_Principal.Usuario, mdi_Principal.Contraseña);
            PreparedStatement pstt4 = cn.prepareStatement("select * from cotizacion_detalle_cliente");
            ResultSet rss4 = pstt4.executeQuery();

            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("IdCotDetClie.");
            modelo.addColumn("IdServicio.");
            modelo.addColumn("idcotencclie");
            modelo.addColumn("IdMoneda");
            modelo.addColumn("Cantidad");
            modelo.addColumn("Costo");
            
            tbl.setModel(modelo);
            String[] dato = new String[6];
            while (rss4.next()) {
                dato[0] = rss4.getString(1);
                dato[1] = rss4.getString(2);
                dato[2] = rss4.getString(3);
                dato[3] = rss4.getString(4);
                dato[4] = rss4.getString(5);
                dato[5] = rss4.getString(6);
                
                modelo.addRow(dato);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
    public void iniciar_combo() {
        try 
        {
            Connection cn = DriverManager.getConnection(mdi_Principal.BD, mdi_Principal.Usuario, mdi_Principal.Contraseña);
            
            PreparedStatement pst2 = cn.prepareStatement("select nombre_servicio from servicios");
            PreparedStatement pst3 = cn.prepareStatement("select id_cotizacion_encabezado_cliente from cotizacion_encabezado_cliente");
            PreparedStatement pst4 = cn.prepareStatement("select nombre_moneda from moneda");
            
                      
            ResultSet rs2 = pst2.executeQuery();
            ResultSet rs3 = pst3.executeQuery();
            ResultSet rs4 = pst4.executeQuery();
            
            cbox_Servicio.removeAllItems();
            cbox_CotEncCliente.removeAllItems();
            cbox_Moneda.removeAllItems();
            
            cbox_Servicio.addItem("Seleccione una opción");
            cbox_CotEncCliente.addItem("Seleccione una opción");
            cbox_Moneda.addItem("Seleccione una opción");
            
            while (rs2.next() && rs3.next() && rs4.next()) {
                
                cbox_Servicio.addItem(rs2.getString("nombre_servicio"));
                cbox_CotEncCliente.addItem(rs3.getString("id_cotizacion_encabezado_cliente"));
                cbox_Moneda.addItem(rs4.getString("nombre_moneda"));
                
               }
        } catch (Exception e) {
            e.printStackTrace();
        }
        tablas();
    }
    
    
    public Cot_Det_Cliente() {
        initComponents();
        tablas();
        iniciar_combo();        
        get_usuario();
        get_fecha();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbusu = new javax.swing.JLabel();
        fecha = new com.toedter.calendar.JDateChooser();
        btnBuscar = new javax.swing.JButton();
        txt_Cantidad = new javax.swing.JTextField();
        label1 = new javax.swing.JLabel();
        cbox_Servicio = new javax.swing.JComboBox<>();
        label7 = new javax.swing.JLabel();
        cbox_CotEncCliente = new javax.swing.JComboBox<>();
        label9 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        cbox_Moneda = new javax.swing.JComboBox<>();
        lb3 = new javax.swing.JLabel();
        lb4 = new javax.swing.JLabel();
        btnModificar = new javax.swing.JButton();
        label3 = new javax.swing.JLabel();
        txtbuscado = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        label2 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        label10 = new javax.swing.JLabel();
        lb1 = new javax.swing.JLabel();
        txt_Costo = new javax.swing.JTextField();
        label4 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setVisible(true);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txt_Cantidad.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txt_Cantidad.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        txt_Cantidad.setOpaque(false);

        label1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label1.setText("Resgistros");

        cbox_Servicio.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cbox_Servicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_ServicioActionPerformed(evt);
            }
        });

        label7.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label7.setText("Id Servicio");

        cbox_CotEncCliente.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cbox_CotEncCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_CotEncClienteActionPerformed(evt);
            }
        });

        label9.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label9.setText("IdCotEncCliente");

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        cbox_Moneda.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cbox_Moneda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_MonedaActionPerformed(evt);
            }
        });

        lb3.setForeground(new java.awt.Color(204, 204, 204));

        lb4.setForeground(new java.awt.Color(204, 204, 204));

        btnModificar.setText("Modificar");
        btnModificar.setEnabled(false);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        label3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label3.setText("Cantidad");

        tbl.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IdCotDetClie", "IdServicio", "IdCotEncClie", "IdMoneda", "Cantidad", "Costo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl);

        label2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label2.setText("Cotizacion Detalle Cliente");

        btnEliminar.setText("Eliminar");
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        label10.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label10.setText("Id Modenda");

        lb1.setForeground(new java.awt.Color(204, 204, 204));

        txt_Costo.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txt_Costo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        txt_Costo.setOpaque(false);

        label4.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label4.setText("Costo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addComponent(lb1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(label7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbox_Servicio, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(label9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbox_CotEncCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(label4)
                                    .addComponent(label3)
                                    .addComponent(label10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbox_Moneda, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_Costo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lb3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtbuscado, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(label2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(label1)
                        .addGap(379, 379, 379))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 912, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cbox_Servicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(label7)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbox_CotEncCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbox_Moneda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(label3)
                                    .addComponent(txt_Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(label4)
                                    .addComponent(txt_Costo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(59, 59, 59))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent(lb3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lb4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRegistrar)
                            .addComponent(btnEliminar)
                            .addComponent(btnModificar))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtbuscado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar)
                            .addComponent(btnLimpiar))
                        .addGap(85, 85, 85))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label1)
                            .addComponent(label2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(143, 143, 143))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        try {
            Connection cn = DriverManager.getConnection(mdi_Principal.BD, mdi_Principal.Usuario, mdi_Principal.Contraseña);
            PreparedStatement pst = cn.prepareStatement("select * from cotizacion_detalle_cliente where id_cotizacion_detalle_cliente = ?");
            pst.setString(1, txtbuscado.getText().trim()); 

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {

                lb1.setText(rs.getString("id_servicio"));
                lb3.setText(rs.getString("id_cotizacion_encabezado_cliente"));
                lb4.setText(rs.getString("id_moneda"));
                txt_Cantidad.setText(rs.getString("cantidad"));
                txt_Costo.setText(rs.getString("costo"));
                btnModificar.setEnabled(true);
                btnEliminar.setEnabled(true);
                btnRegistrar.setEnabled(false);
                tablas();
                bitacora_buscar();

            } else {
                JOptionPane.showMessageDialog(null, "No esta registrado.");
            }

        } catch (Exception e) {

        }

        // tablas();
        // bitacora_busqueda();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void cbox_ServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_ServicioActionPerformed
        try {
            Connection cn = DriverManager.getConnection(mdi_Principal.BD, mdi_Principal.Usuario, mdi_Principal.Contraseña);

            PreparedStatement pst2 = cn.prepareStatement("select id_servicio from servicios where nombre_servicio = ?");
            pst2.setString(1, cbox_Servicio.getSelectedItem().toString());
            ResultSet rs2 = pst2.executeQuery();

            if (rs2.next()) {
                lb1.setText(rs2.getString("id_servicio"));

            } else {
                if (cbox_Servicio.getSelectedItem().toString().contains("Seleccione una opción")) {
                    txt_Cantidad.setText("");
                    txt_Costo.setText("");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_cbox_ServicioActionPerformed

    private void cbox_CotEncClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_CotEncClienteActionPerformed
        try {
            Connection cn = DriverManager.getConnection(mdi_Principal.BD, mdi_Principal.Usuario, mdi_Principal.Contraseña);

            PreparedStatement pst2 = cn.prepareStatement("select * from cotizacion_encabezado_cliente where id_cotizacion_encabezado_cliente = ?");
            pst2.setString(1, cbox_CotEncCliente.getSelectedItem().toString());
            ResultSet rs2 = pst2.executeQuery();

            if (rs2.next()) {
                lb3.setText(rs2.getString("id_cotizacion_encabezado_cliente"));

            } else {
                if (cbox_CotEncCliente.getSelectedItem().toString().contains("Seleccione una opción")) {
                    txt_Cantidad.setText("");
                    txt_Costo.setText("");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_cbox_CotEncClienteActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed

        cbox_Servicio.setSelectedIndex(0);
        cbox_CotEncCliente.setSelectedIndex(0);
        cbox_Moneda.setSelectedIndex(0);
        btnModificar.setEnabled(false);
        btnEliminar.setEnabled(false);
        txtbuscado.setText("");
        btnRegistrar.setEnabled(true);
        btnModificar.setEnabled(false);
        btnEliminar.setEnabled(false);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void cbox_MonedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_MonedaActionPerformed
        try {
            Connection cn = DriverManager.getConnection(mdi_Principal.BD, mdi_Principal.Usuario, mdi_Principal.Contraseña);

            PreparedStatement pst2 = cn.prepareStatement("select id_moneda from moneda where nombre_moneda = ?");
            pst2.setString(1, cbox_Moneda.getSelectedItem().toString());
            ResultSet rs2 = pst2.executeQuery();

            if (rs2.next()) {
                lb4.setText(rs2.getString("id_moneda"));

            } else {
                if (cbox_Moneda.getSelectedItem().toString().contains("Seleccione una opción")) {
                    txt_Cantidad.setText("");
                    txt_Costo.setText("");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_cbox_MonedaActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        try {
            String ID = txtbuscado.getText().trim();
          
            Connection cn = DriverManager.getConnection(mdi_Principal.BD, mdi_Principal.Usuario, mdi_Principal.Contraseña);
            PreparedStatement pst = cn.prepareStatement("update cotizacion_detalle_cliente set id_servicio = ?,id_cotizacion_encabezado_cliente = ?, id_moneda = ?,cantidad = ?,costo = ? where id_cotizacion_detalle_cliente = " + ID);
            
            pst.setString(1, lb1.getText());
            pst.setString(2, lb3.getText());
            pst.setString(3, lb4.getText());
            pst.setString(4, txt_Cantidad.getText());
            pst.setString(5, txt_Costo.getText());
            
            pst.executeUpdate();

            //bitacora_modificar();
            JOptionPane.showMessageDialog(this, "¡MODIFICACION EXITOSA!", "Mensaje", JOptionPane.INFORMATION_MESSAGE);

            bitacora_modificar();
            txt_Cantidad.setText("");
            txt_Costo.setText("");
            txtbuscado.setText("");
            btnRegistrar.setEnabled(true);
            btnModificar.setEnabled(false);
            btnEliminar.setEnabled(false);
            tablas();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error en Modificacion", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        try {
            Connection cn = DriverManager.getConnection(mdi_Principal.BD, mdi_Principal.Usuario, mdi_Principal.Contraseña);
            PreparedStatement pst = cn.prepareStatement("delete from cotizacion_detalle_cliente where id_cotizacion_detalle_cliente = ?");

            pst.setString(1, txtbuscado.getText().trim());
            pst.executeUpdate();

            // bitacora_eliminar();
            JOptionPane.showMessageDialog(this, "¡ELIMINACION EXITOSA!", "Mensaje", JOptionPane.INFORMATION_MESSAGE);

            bitacora_eliminar();
            txt_Cantidad.setText("");
            txt_Costo.setText("");
            txtbuscado.setText("");
            btnRegistrar.setEnabled(true);
            btnModificar.setEnabled(false);
            btnEliminar.setEnabled(false);
            tablas();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error en Eliminacion", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        try {
            
            Connection cn = DriverManager.getConnection(mdi_Principal.BD, mdi_Principal.Usuario, mdi_Principal.Contraseña);
            //localhost es 127.0.0.1
            PreparedStatement pst = cn.prepareStatement("insert into cotizacion_detalle_cliente values(?,?,?,?,?,?)");

            pst.setString(1, "0");
            pst.setString(2, lb1.getText());
            pst.setString(3, lb3.getText());
            pst.setString(4, lb4.getText());
            pst.setString(5, txt_Cantidad.getText());
            pst.setString(6, txt_Costo.getText());

            //bitacora_guardar();
            pst.executeUpdate();

            JOptionPane.showMessageDialog(this, "¡REGISTRO EXITOSO!", "Mensaje", JOptionPane.INFORMATION_MESSAGE);

            bitacora_guardar();
            txt_Cantidad.setText("");
            txt_Costo.setText("");
            cbox_Servicio.setSelectedIndex(0);
            cbox_CotEncCliente.setSelectedIndex(0);
            cbox_Moneda.setSelectedIndex(0);
            txtbuscado.setText("");
            tablas();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error en registro", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cbox_CotEncCliente;
    private javax.swing.JComboBox<String> cbox_Moneda;
    private javax.swing.JComboBox<String> cbox_Servicio;
    private com.toedter.calendar.JDateChooser fecha;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label10;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label7;
    private javax.swing.JLabel label9;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lb4;
    private javax.swing.JLabel lbusu;
    private javax.swing.JTable tbl;
    private javax.swing.JTextField txt_Cantidad;
    private javax.swing.JTextField txt_Costo;
    private javax.swing.JTextField txtbuscado;
    // End of variables declaration//GEN-END:variables
}
