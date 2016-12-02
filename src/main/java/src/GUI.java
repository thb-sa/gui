package src;


import datenKlassen.Aenderungsmeldung;
import datenKlassen.Station;
import datenKlassen.StationAenderung;
import datenKlassen.Tageswerte;
import funktionaleKlassen.NeuesObjektListener;
import funktionaleKlassen.ZweiwegeClientkommunikator;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.List;
import java.awt.Panel;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;




public class GUI extends javax.swing.JFrame implements
			NeuesObjektListener<Station> {

   DefaultListModel listModel = new DefaultListModel();
   HashMap<String, Integer> list= new HashMap<String, Integer>();
    ConcurrentHashMap<String,Station> list_st=new  ConcurrentHashMap<String,Station>(); 
    DefaultListModel list_station = new DefaultListModel();
      //List<String> list11 = new ArrayList<String>();
  
    public GUI() {
        initComponents();
        station_list.setModel(listModel);
      
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenu = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        station_list = new javax.swing.JList<>();
        info = new javax.swing.JPanel();
        Label_ID = new javax.swing.JLabel();
        Station_ID = new javax.swing.JTextField();
        Label_Date = new javax.swing.JLabel();
        date = new javax.swing.JTextField();
        Label_Taregt = new javax.swing.JLabel();
        Taregt = new javax.swing.JTextField();
        Label_Actuel = new javax.swing.JLabel();
        Actuel = new javax.swing.JTextField();
        Label_variance = new javax.swing.JLabel();
        Variance = new javax.swing.JTextField();
        button1 = new java.awt.Button();
        butten_variance = new javax.swing.JButton();
        Menu = new javax.swing.JMenuBar();
        Diagramme = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contenu.setBackground(new java.awt.Color(51, 102, 255));
        contenu.setToolTipText("");

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));

        station_list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                station_listMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(station_list);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        info.setBackground(new java.awt.Color(51, 102, 255));
        info.setLayout(new java.awt.GridLayout(5, 2, 10, 20));

        Label_ID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Label_ID.setText("Station ID");
        Label_ID.setName("label_Station ID"); // NOI18N
        info.add(Label_ID);

        Station_ID.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        Station_ID.setAlignmentY(0.2F);
        Station_ID.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        Station_ID.setEnabled(false);
        Station_ID.setMinimumSize(new java.awt.Dimension(6, 10));
        info.add(Station_ID);

        Label_Date.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Label_Date.setText("Date");
        Label_Date.setName("label_Date"); // NOI18N
        info.add(Label_Date);

        date.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        date.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateActionPerformed(evt);
            }
        });
        date.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dateKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dateKeyTyped(evt);
            }
        });
        info.add(date);

        Label_Taregt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Label_Taregt.setText("Taregt");
        Label_Taregt.setName("label_taregt"); // NOI18N
        info.add(Label_Taregt);

        Taregt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Taregt.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        Taregt.setEnabled(false);
        info.add(Taregt);

        Label_Actuel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Label_Actuel.setText("Actuel");
        Label_Actuel.setName("label_Actuel"); // NOI18N
        info.add(Label_Actuel);

        Actuel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Actuel.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        Actuel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ActuelKeyTyped(evt);
            }
        });
        info.add(Actuel);

        Label_variance.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Label_variance.setText("Variance");
        Label_variance.setName("label_Variance"); // NOI18N
        info.add(Label_variance);

        Variance.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Variance.setEnabled(false);
        info.add(Variance);

        button1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button1.setLabel("?");
        button1.setName("help"); // NOI18N
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        butten_variance.setText("Variance");
        butten_variance.setEnabled(false);
        butten_variance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butten_varianceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contenuLayout = new javax.swing.GroupLayout(contenu);
        contenu.setLayout(contenuLayout);
        contenuLayout.setHorizontalGroup(
            contenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenuLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(info, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(butten_variance)
                .addGap(122, 122, 122))
        );
        contenuLayout.setVerticalGroup(
            contenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenuLayout.createSequentialGroup()
                .addGroup(contenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenuLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contenuLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(info, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contenuLayout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(butten_variance)
                .addGap(51, 51, 51))
        );

        Diagramme.setText("Diagramme");
        Diagramme.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                DiagrammeMenuSelected(evt);
            }
        });
        Diagramme.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DiagrammeMouseClicked(evt);
            }
        });
        Menu.add(Diagramme);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(contenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DiagrammeMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_DiagrammeMenuSelected

    }//GEN-LAST:event_DiagrammeMenuSelected

    private void DiagrammeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DiagrammeMouseClicked
       try{
           Station station;
             DefaultCategoryDataset dateset = new DefaultCategoryDataset();
           
             station=list_st.get(Station_ID.getText());
          /*   if(!station.getAktuelleWerte().isEmpty())
          *   {
         *        String st=station.getAktuelleWerte().keys().nextElement();
          *   date.setText(st);
          *   Variance.setText(Integer.toString(station.getAktuelleWerte().get(st).getRelativeAbweichung()));
          *   }
            else
          *   {
          *       date.setText("");
             }*/
           for(String datum: station.getAktuelleWerte().keySet())
           {
               dateset.setValue(station.getAktuelleWerte().get(datum).getRelativeAbweichung(),"", datum);
           }
            JFreeChart chart=ChartFactory.createLineChart(station_list.getSelectedValue(), "Date", "Variance", dateset, PlotOrientation.VERTICAL, false, true,true);
            BarRenderer renderer=null;
            CategoryPlot plot=null;
            renderer=new BarRenderer();
            ChartFrame frame=new  ChartFrame("variance",chart);
            frame.setVisible(true);
            frame.setSize(400, 400);

        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
       
    }//GEN-LAST:event_DiagrammeMouseClicked

    private void butten_varianceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butten_varianceActionPerformed
        try {
            ZweiwegeClientkommunikator<Aenderungsmeldung, StationAenderung> zCK = new ZweiwegeClientkommunikator<Aenderungsmeldung, StationAenderung>(
                "54.89.87.213", new NeuesObjektListener<Aenderungsmeldung>() {
                    /*
                    * Anonyme Implementierung des Interfaces: kein guter
                    * Stil, aber nur ein Beispiel
                    */
                    public void neuesAustauschobjekt(Aenderungsmeldung austauschobjekt) {

                       Tageswerte.Darstellung variance=austauschobjekt.getTageswerte().getDarstellung();
                      /*  if(variance-Integer.parseInt(Taregt.getText())<=10)
                     *   Variance.setDisabledTextColor(Color.RED);
                     *   if(variance-Integer.parseInt(Taregt.getText())>=5)
                     *   Variance.setDisabledTextColor(Color.GREEN);
                       
                      */ 
                      if(variance.equals(Tageswerte.Darstellung.HOCH))
                          Variance.setDisabledTextColor(Color.GREEN);
                       if(variance.equals(Tageswerte.Darstellung.NIEDRIG))
                          Variance.setDisabledTextColor(Color.RED);
                         if(variance.equals(Tageswerte.Darstellung.NORMAL))
                            Variance.setDisabledTextColor(Color.BLACK);
                      Variance.setText(Integer.toString(austauschobjekt.getTageswerte().getAbweichung()) +""+"%");
                      //  list_station.addElement(new Aenderungsmeldung(Station_ID.getText(),date.getText(),austauschobjekt.getTageswerte().getAktuellerWert(),austauschobjekt.getTageswerte().getAbweichung(),austauschobjekt.getTageswerte().getRelativeAbweichung()));
                     Station a= list_st.get(austauschobjekt.getStationID());
                     a.getAktuelleWerte().put(austauschobjekt.getDatum(), austauschobjekt.getTageswerte());
                    }
                }, ZweiwegeClientkommunikator.ZWEIWEGEKOMMUNIKATION);

                /*
                * Sehr wichtig: das Starten des Threads nicht vergessen
                */
                zCK.start();

                /*
                * Hier wird jetzt beispielsweise eine StationsAenderung versendet.
                */
                zCK.versende(new StationAenderung(Station_ID.getText(),date.getText(), Integer.parseInt(Actuel.getText())));
                            
            } catch (UnknownHostException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
    }//GEN-LAST:event_butten_varianceActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        //  Geburtsdatum (nach dem Muster TT.MM.JJJJ ausfüllen):
        JOptionPane.showMessageDialog(null,"Date (nach dem Muster TT.MM.JJJJ ausfüllen");
    }//GEN-LAST:event_button1ActionPerformed

    private void ActuelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ActuelKeyTyped
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c)) || c==KeyEvent.VK_DELETE ){
            evt.consume();
        }
    }//GEN-LAST:event_ActuelKeyTyped

    private void dateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dateKeyTyped
        char c=evt.getKeyChar();
        String st=this.date.getText();
        if(!(Character.isDigit(c)) || c==KeyEvent.VK_DELETE || st.length()==10){
            evt.consume();
        }
    }//GEN-LAST:event_dateKeyTyped

    private void dateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dateKeyReleased
        String st=this.date.getText();
        if(st.length()==2 || st.length()==5)
        {
            date.setText(st+".");
        }
    }//GEN-LAST:event_dateKeyReleased

    private void dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateActionPerformed

    }//GEN-LAST:event_dateActionPerformed

    private void station_listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_station_listMouseClicked
        butten_variance.setEnabled(true);
        Station_ID.setText(station_list.getSelectedValue());
        String ch=station_list.getSelectedValue();
        Taregt.setText(Integer.toString(list_st.get(ch).getVorgabewert()));
        date.setText("");
        Actuel.setText("");
        Variance.setText("");
    }//GEN-LAST:event_station_listMouseClicked

    public String getStation_ID() {
        return Station_ID.getText();
    }

    public void setStation_ID(String Station_ID) {
        this.Station_ID.setText(Station_ID);
    }

    public String getActuel() {
        return Actuel.getText();
    }

    public void setActuel(String Actuel) {
        this.Actuel.setText(Actuel);
    }

    public String getTaregt() {
        return Taregt.getText();
    }

    public void setTaregt(String Taregt) {
        this.Taregt.setText(Taregt);
    }

    public String getVariance() {
        return Variance.getText();
    }

    public void setVariance(String Variance) {
        this.Variance.setText(Variance);
    }

    public String getDate() {
        return date.getText();
    }

    public void setDate(String date) {
        this.date.setText(date);
    }
  public void setColerVariance(String Variance, Color color) {
        this.Variance.setText(Variance);
        this.Variance.setDisabledTextColor(color);
    }

    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Actuel;
    private javax.swing.JMenu Diagramme;
    private javax.swing.JLabel Label_Actuel;
    private javax.swing.JLabel Label_Date;
    private javax.swing.JLabel Label_ID;
    private javax.swing.JLabel Label_Taregt;
    private javax.swing.JLabel Label_variance;
    private javax.swing.JMenuBar Menu;
    private javax.swing.JTextField Station_ID;
    private javax.swing.JTextField Taregt;
    private javax.swing.JTextField Variance;
    private javax.swing.JButton butten_variance;
    private java.awt.Button button1;
    private javax.swing.JPanel contenu;
    private javax.swing.JTextField date;
    private javax.swing.JPanel info;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> station_list;
    // End of variables declaration//GEN-END:variables

    @Override
    public void neuesAustauschobjekt(Station a) {      
   
       listModel.addElement(a.getStationID());
      // list.put(a.getStationID(), a.getVorgabewert());
       list_st.put(a.getStationID(), a);
 
    }
}

