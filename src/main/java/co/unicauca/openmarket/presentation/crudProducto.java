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
        jTextField6 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        pnlSeccionBotones = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        lblCodigoProducto.setText("Codigo Producto");

        lblNombre.setText("Nombre");

        jLabel3.setText("Descripcion");

        lblPrecio.setText("Precio");

        lblDireccion.setText("Direccion");

        lblCodigoCategoria.setText("Codigo Cataegoria");

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout pnlCrudpProductoLayout = new javax.swing.GroupLayout(pnlCrudpProducto);
        pnlCrudpProducto.setLayout(pnlCrudpProductoLayout);
        pnlCrudpProductoLayout.setHorizontalGroup(
            pnlCrudpProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCrudpProductoLayout.createSequentialGroup()
                .addGroup(pnlCrudpProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCrudpProductoLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(pnlCrudpProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
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
                            .addComponent(txtCodigoProducto)))
                    .addGroup(pnlCrudpProductoLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlCrudpProductoLayout.setVerticalGroup(
            pnlCrudpProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCrudpProductoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblCodigoProducto)
                .addGap(3, 3, 3)
                .addComponent(txtCodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(12, Short.MAX_VALUE))
        );

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
                .addGap(15, 15, 15)
                .addComponent(btnNuevo)
                .addGap(18, 18, 18)
                .addComponent(btnEditar)
                .addGap(18, 18, 18)
                .addComponent(btnGuardar)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminar)
                .addContainerGap(119, Short.MAX_VALUE))
        );
        pnlSeccionBotonesLayout.setVerticalGroup(
            pnlSeccionBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeccionBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSeccionBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnEditar)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar)
                    .addComponent(btnEliminar))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCrudpProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlSeccionBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnlCrudpProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlSeccionBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel lblCodigoCategoria;
    private javax.swing.JLabel lblCodigoProducto;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JPanel pnlCrudpProducto;
    private javax.swing.JPanel pnlSeccionBotones;
    private javax.swing.JTextField txtCodigoProducto;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
