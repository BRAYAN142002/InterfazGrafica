/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.openmarket.presentation;

/**
 *
 * @author brayan
 */
public class crudProducto extends javax.swing.JPanel {

    /**
     * Creates new form crudProducto
     */
    public crudProducto() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        pnlCrudpProducto = new javax.swing.JPanel();
        lblCodigoProducto = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtCodigoProducto = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        lblDireccion = new javax.swing.JLabel();
        lblCodigoCategoria = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        rdIdProducto = new javax.swing.JRadioButton();
        rdIdCategoria = new javax.swing.JRadioButton();
        rdNombreProducto = new javax.swing.JRadioButton();
        txtBuscarProducto = new javax.swing.JTextField();
        cbxCodigoCategoria = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        btnExaminar = new javax.swing.JButton();
        lblExaminar = new javax.swing.JLabel();
        pnlSeccionBotones = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCodigoProducto.setText("Codigo Producto");

        lblNombre.setText("Nombre");

        jLabel3.setText("Descripcion");

        lblPrecio.setText("Precio");

        lblDireccion.setText("Direccion");

        lblCodigoCategoria.setText("Codigo Cataegoria");

        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblProductos);

        buttonGroup1.add(rdIdProducto);
        rdIdProducto.setText("Codigo producto");

        buttonGroup1.add(rdIdCategoria);
        rdIdCategoria.setText("Codigo Categoria");

        buttonGroup1.add(rdNombreProducto);
        rdNombreProducto.setSelected(true);
        rdNombreProducto.setText("Nombre Producto");

        cbxCodigoCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnBuscar.setText("Buscar");

        btnListar.setText("Listar Todo");

        btnExaminar.setText("Examinar");

        lblExaminar.setText("jLabel1");
        lblExaminar.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout pnlCrudpProductoLayout = new javax.swing.GroupLayout(pnlCrudpProducto);
        pnlCrudpProducto.setLayout(pnlCrudpProductoLayout);
        pnlCrudpProductoLayout.setHorizontalGroup(
            pnlCrudpProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCrudpProductoLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(pnlCrudpProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCrudpProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtDireccion)
                        .addComponent(txtPrecio)
                        .addComponent(txtDescripcion)
                        .addComponent(txtNombre)
                        .addComponent(lblCodigoCategoria)
                        .addComponent(lblDireccion)
                        .addComponent(lblPrecio)
                        .addComponent(jLabel3)
                        .addComponent(lblNombre)
                        .addComponent(lblCodigoProducto)
                        .addComponent(txtCodigoProducto)
                        .addComponent(cbxCodigoCategoria, 0, 239, Short.MAX_VALUE))
                    .addGroup(pnlCrudpProductoLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblExaminar, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExaminar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(pnlCrudpProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCrudpProductoLayout.createSequentialGroup()
                        .addGroup(pnlCrudpProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdIdProducto)
                            .addComponent(rdIdCategoria))
                        .addGap(31, 31, 31)
                        .addComponent(txtBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnListar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCrudpProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rdNombreProducto)))
                .addContainerGap())
        );
        pnlCrudpProductoLayout.setVerticalGroup(
            pnlCrudpProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCrudpProductoLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(pnlCrudpProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlCrudpProductoLayout.createSequentialGroup()
                        .addGroup(pnlCrudpProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCodigoProducto)
                            .addComponent(rdIdProducto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlCrudpProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rdIdCategoria)))
                    .addGroup(pnlCrudpProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnListar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(pnlCrudpProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCrudpProductoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblNombre))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCrudpProductoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdNombreProducto)))
                .addGroup(pnlCrudpProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCrudpProductoLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCrudpProductoLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblPrecio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDireccion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCodigoCategoria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxCodigoCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pnlCrudpProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCrudpProductoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblExaminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCrudpProductoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                                .addComponent(btnExaminar)
                                .addGap(8, 8, 8)))))
                .addContainerGap())
        );

        add(pnlCrudpProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 977, 530));

        btnNuevo.setText("Nuevo");

        btnEditar.setText("Editar");

        btnGuardar.setText("Guardar");

        btnCancelar.setText("Cancelar");

        btnEliminar.setText("Eliminar");

        javax.swing.GroupLayout pnlSeccionBotonesLayout = new javax.swing.GroupLayout(pnlSeccionBotones);
        pnlSeccionBotones.setLayout(pnlSeccionBotonesLayout);
        pnlSeccionBotonesLayout.setHorizontalGroup(
            pnlSeccionBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeccionBotonesLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btnNuevo)
                .addGap(26, 26, 26)
                .addComponent(btnEditar)
                .addGap(43, 43, 43)
                .addComponent(btnGuardar)
                .addGap(41, 41, 41)
                .addComponent(btnCancelar)
                .addGap(36, 36, 36)
                .addComponent(btnEliminar)
                .addContainerGap(513, Short.MAX_VALUE))
        );
        pnlSeccionBotonesLayout.setVerticalGroup(
            pnlSeccionBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeccionBotonesLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pnlSeccionBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnEditar)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar)
                    .addComponent(btnEliminar))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        add(pnlSeccionBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 977, 60));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnExaminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbxCodigoCategoria;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodigoCategoria;
    private javax.swing.JLabel lblCodigoProducto;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblExaminar;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JPanel pnlCrudpProducto;
    private javax.swing.JPanel pnlSeccionBotones;
    private javax.swing.JRadioButton rdIdCategoria;
    private javax.swing.JRadioButton rdIdProducto;
    private javax.swing.JRadioButton rdNombreProducto;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTextField txtBuscarProducto;
    private javax.swing.JTextField txtCodigoProducto;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
