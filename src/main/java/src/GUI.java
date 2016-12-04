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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
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




public class GUI extends javax.swing.JFrame    implements
			NeuesObjektListener<Station> {
 Thread th =new  Thread();

   DefaultListModel listModel = new DefaultListModel();
   HashMap<String, Integer> list= new HashMap<String, Integer>();
    ConcurrentHashMap<String,Station> list_st=new  ConcurrentHashMap<String,Station>(); 
 
    DefaultListModel list_station = new DefaultListModel();
     
  
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
        panel_datelist = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Date_list = new javax.swing.JList<>();
        Panel_newStation = new javax.swing.JPanel();
        newStation = new javax.swing.JLabel();
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
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
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

        panel_datelist.setBackground(new java.awt.Color(51, 102, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Date List: ");

        Date_list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Date_listMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Date_list);

        javax.swing.GroupLayout panel_datelistLayout = new javax.swing.GroupLayout(panel_datelist);
        panel_datelist.setLayout(panel_datelistLayout);
        panel_datelistLayout.setHorizontalGroup(
            panel_datelistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_datelistLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_datelistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_datelistLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 70, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        panel_datelistLayout.setVerticalGroup(
            panel_datelistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_datelistLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE))
        );

        jLabel1.getAccessibleContext().setAccessibleName("");

        Panel_newStation.setBackground(new java.awt.Color(51, 102, 255));
        Panel_newStation.setToolTipText("");

        newStation.setBackground(new java.awt.Color(255, 0, 0));
        newStation.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        newStation.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout Panel_newStationLayout = new javax.swing.GroupLayout(Panel_newStation);
        Panel_newStation.setLayout(Panel_newStationLayout);
        Panel_newStationLayout.setHorizontalGroup(
            Panel_newStationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_newStationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(newStation)
                .addContainerGap(293, Short.MAX_VALUE))
        );
        Panel_newStationLayout.setVerticalGroup(
            Panel_newStationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_newStationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(newStation)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout contenuLayout = new javax.swing.GroupLayout(contenu);
        contenu.setLayout(contenuLayout);
        contenuLayout.setHorizontalGroup(
            contenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenuLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(Panel_newStation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(butten_variance)
                        .addGap(248, 248, 248))
                    .addGroup(contenuLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(info, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel_datelist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        contenuLayout.setVerticalGroup(
            contenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenuLayout.createSequentialGroup()
                .addGroup(contenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenuLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contenuLayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contenuLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(info, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panel_datelist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(contenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenuLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                        .addComponent(butten_variance)
                        .addGap(72, 72, 72))
                    .addGroup(contenuLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Panel_newStation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
            .addComponent(contenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
           
          ArrayList<Date> l = new ArrayList<>();
           Station station;
             DefaultCategoryDataset dateset = new DefaultCategoryDataset();
           
             station=list_st.get(Station_ID.getText());
          
           for(String datum: station.getAktuelleWerte().keySet())
           {
            int tag=Integer.parseInt(datum.substring(0, 2));
            int monate=Integer.parseInt(datum.substring(3, 5));
            int jahre=Integer.parseInt(datum.substring(6, 10));
              l.add(new Date(jahre,monate,tag));
           }
           Collections.sort(l);
           if(l.size()>5)
           { int j=0;
            ArrayList<Date> list = new ArrayList<>();
                for(int i=l.size()-1;j<5;i--) {
                    list.add(l.get(i));
                    j++;
                }
                l.removeAll(l);
                l.addAll(list);
                Collections.sort(l);
           }
            for(int i=0;i<l.size();i++) {
                 String tag=Integer.toString(l.get(i).getDate());
                String monate=Integer.toString(l.get(i).getMonth());
                String jahre=Integer.toString(l.get(i).getYear());
                if(l.get(i).getDate()<10)
                     tag="0"+ tag;
                if(l.get(i).getMonth()<10)
                    monate="0"+monate;             
                String date=tag+"."+monate+"."+jahre;
               dateset.setValue(station.getAktuelleWerte().get(date).getRelativeAbweichung(),"", date);
            }
        
           
            JFreeChart chart=ChartFactory.createLineChart(station_list.getSelectedValue(), "Date", "Variance", dateset, PlotOrientation.VERTICAL, false, true,true);
            BarRenderer renderer=null;
            CategoryPlot plot=null;
            renderer=new BarRenderer();
            ChartFrame frame=new  ChartFrame("variance",chart);
            frame.setVisible(true);
            frame.setSize(600, 400);

        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
       
    }//GEN-LAST:event_DiagrammeMouseClicked

    private void butten_varianceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butten_varianceActionPerformed
        try {

           if(date.getText().length()==10)
           {String d=date.getText();
               String dat= d.substring(0, 2)+ d.substring(3, 5)+ d.substring(6, 10);
               if(test_date(dat))
               {
                   
             
            Variance.setText("");
            ZweiwegeClientkommunikator<Aenderungsmeldung, StationAenderung> zCK = new ZweiwegeClientkommunikator<Aenderungsmeldung, StationAenderung>(
                "54.89.87.213", new NeuesObjektListener<Aenderungsmeldung>() {
                    /*
                    * Anonyme Implementierung des Interfaces: kein guter
                    * Stil, aber nur ein Beispiel
                    */
                    public void neuesAustauschobjekt(Aenderungsmeldung austauschobjekt) {

                       Tageswerte.Darstellung variance=austauschobjekt.getTageswerte().getDarstellung();
                      if(variance.equals(Tageswerte.Darstellung.HOCH))
                          Variance.setDisabledTextColor(Color.GREEN);
                       if(variance.equals(Tageswerte.Darstellung.NIEDRIG))
                          Variance.setDisabledTextColor(Color.RED);
                         if(variance.equals(Tageswerte.Darstellung.NORMAL))
                            Variance.setDisabledTextColor(Color.BLACK);
                      Variance.setText(Integer.toString(austauschobjekt.getTageswerte().getRelativeAbweichung())+"%");
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
                this.Date_list();
             }
               else
              JOptionPane.showMessageDialog(null,"DateFormat ist Falsch ");
           }
           else
               JOptionPane.showMessageDialog(null,"Date (nach dem Muster TT.MM.JJJJ ausfüllen ");
            } catch (UnknownHostException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, e.toString());
                
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, e.toString());
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
private void Date_list()
{
    try{
         ArrayList<Date> l = new ArrayList<>();
        DefaultListModel listdate = new DefaultListModel();
        Station station;
        station=list_st.get(station_list.getSelectedValue());
        if((station.getAktuelleWerte().size())>0)
        {
            panel_datelist.setVisible(true);
           for(String datum: station.getAktuelleWerte().keySet())
           {
            int tag=Integer.parseInt(datum.substring(0, 2));
            int monate=Integer.parseInt(datum.substring(3, 5));
            int jahre=Integer.parseInt(datum.substring(6, 10));
              l.add(new Date(jahre,monate,tag));
           }
           Collections.sort(l);
            for(int i=0;i<l.size();i++) {
                String tag=Integer.toString(l.get(i).getDate());
                String monate=Integer.toString(l.get(i).getMonth());
                String jahre=Integer.toString(l.get(i).getYear());
                if(l.get(i).getDate()<10)
                     tag="0"+ tag;
                if(l.get(i).getMonth()<10)
                    monate="0"+monate;
                String date=tag+"."+monate+"."+jahre;
                listdate.addElement(date);
            }
           Date_list.setModel(listdate);
        }
        else
            panel_datelist.setVisible(false);
    }
    catch (Exception e) {
           JOptionPane.showMessageDialog(null,e.toString());
            }
}

public Boolean test_date(String date)
{
   //  String s = "20070229"; // 29 février 2007 !
    
        SimpleDateFormat dateFormat = new SimpleDateFormat("ddMMyyyy" );
        dateFormat.setLenient(false);
        java.util.Date dat = null;
        try {
            dat = dateFormat.parse(date);
        } catch (ParseException ex) {
            ex.printStackTrace();
            return false;
        }
       
        return true;
}
    private void station_listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_station_listMouseClicked
        try
        {
        this.Date_list();
        butten_variance.setEnabled(true);
        Station_ID.setText(station_list.getSelectedValue());
        String ch=station_list.getSelectedValue();
        Taregt.setText(Integer.toString(list_st.get(ch).getVorgabewert()));
        date.setText("");
        Actuel.setText("");
        Variance.setText("");
        }
        catch (Exception e) {
           JOptionPane.showMessageDialog(null,e.toString());
            }
    }//GEN-LAST:event_station_listMouseClicked
 
      
    private void dateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dateKeyTyped
         char c=evt.getKeyChar();
        String st=this.date.getText();
        if(!(Character.isDigit(c)) || c==KeyEvent.VK_DELETE || st.length()==10){
            evt.consume();
        }
    }//GEN-LAST:event_dateKeyTyped

    private void dateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dateKeyReleased
      String st=this.date.getText();
      try{
        if(st.length()==2)
        {
         String tag=st.substring(0, 2);
         if(Integer.parseInt(tag)<=31 &&Integer.parseInt(tag)>0)
            date.setText(st+".");
         else
         {JOptionPane.showMessageDialog(null,"Date (nach dem Muster TT.MM.JJJJ ausfüllen");
             date.setText("");
         }
        }
         if(st.length()==5)
        {
   
         
        }
       
      }
      catch (Exception e) {
                // TODO Auto-generated catch block
               
                JOptionPane.showMessageDialog(null,e.toString());
            }
    }//GEN-LAST:event_dateKeyReleased

    private void Date_listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Date_listMouseClicked
         try
        {
         
         date.setText("");
        Actuel.setText("");
        Variance.setText("");
        
        Station station;
        station=list_st.get(station_list.getSelectedValue());
        
          date.setText(Date_list.getSelectedValue());
          String wert=Integer.toString(station.getAktuelleWerte().get(Date_list.getSelectedValue()).getAktuellerWert());
        Actuel.setText(wert);
           String var=Integer.toString(station.getAktuelleWerte().get(Date_list.getSelectedValue()).getRelativeAbweichung());
         Tageswerte.Darstellung variance=station.getAktuelleWerte().get(date.getText()).getDarstellung();
                      if(variance.equals(Tageswerte.Darstellung.HOCH))
                          Variance.setDisabledTextColor(Color.GREEN);
                       if(variance.equals(Tageswerte.Darstellung.NIEDRIG))
                          Variance.setDisabledTextColor(Color.RED);
                         if(variance.equals(Tageswerte.Darstellung.NORMAL))
                            Variance.setDisabledTextColor(Color.BLACK);
        Variance.setText(var+"%");
           
   
        butten_variance.setEnabled(true);
        Station_ID.setText(station_list.getSelectedValue());
        String ch=station_list.getSelectedValue();
        Taregt.setText(Integer.toString(list_st.get(ch).getVorgabewert()));
      
        }
        catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
                    
    }//GEN-LAST:event_Date_listMouseClicked

    public JPanel getPanel_datelist() {
        return panel_datelist;
    }

    public void setPanel_datelist(Boolean visib) {
        this.panel_datelist.setVisible(visib);
    }
                            

   
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

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Actuel;
    private javax.swing.JList<String> Date_list;
    private javax.swing.JMenu Diagramme;
    private javax.swing.JLabel Label_Actuel;
    private javax.swing.JLabel Label_Date;
    private javax.swing.JLabel Label_ID;
    private javax.swing.JLabel Label_Taregt;
    private javax.swing.JLabel Label_variance;
    private javax.swing.JMenuBar Menu;
    private javax.swing.JPanel Panel_newStation;
    private javax.swing.JTextField Station_ID;
    private javax.swing.JTextField Taregt;
    private javax.swing.JTextField Variance;
    private javax.swing.JButton butten_variance;
    private java.awt.Button button1;
    private javax.swing.JPanel contenu;
    private javax.swing.JTextField date;
    private javax.swing.JPanel info;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel newStation;
    private javax.swing.JPanel panel_datelist;
    private javax.swing.JList<String> station_list;
    // End of variables declaration//GEN-END:variables

    @Override
    public void neuesAustauschobjekt(Station a) {      
   
       listModel.addElement(a.getStationID());
       list_st.put(a.getStationID(), a);
      
       
    }
}

