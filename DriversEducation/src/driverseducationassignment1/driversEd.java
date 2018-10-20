/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driverseducationassignment1;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.Format;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.layout.Border;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author K00200540
 */
public class driversEd extends javax.swing.JFrame {

    String informationSign = "/images/Road Signs/Information Signs/";
    String motorwaySign = "/images/Road Signs/Motorway signs/";
    String regularSign = "/images/Road Signs/Regulatory Traffic Signs/";
    String touristSign = "/images/Road Signs/Tourist Information signs/";
    String warningSignGen = "/images/Road Signs/Warning Traffic Signs/General purpose warning signs/";
    String warningSignRW = "/images/Road Signs/Warning Traffic Signs/Roadworks/";
    String warningSignWT = "/images/Road Signs/Warning Traffic Signs/Warning Traffic Signs/";

    ArrayList infoSignList = new ArrayList();
    ArrayList motorwaySignList = new ArrayList();
    ArrayList regularSignList = new ArrayList();
    ArrayList touristSignList = new ArrayList();
    ArrayList warningSignList = new ArrayList();

    ArrayList questionImage = new ArrayList();

    int size = 97;
    String SignAnswers[] = {
        "Advance information sign for low clearance",
        "Airport",
        "Alternative route for high vehicles",
        "Cul-de-sac",
        "Destination distance",
        "Disabled persons parking bay",
        "Ferry",
        "Hospital sign",
        "Motorway",
        "National Road",
        "Regional road direction",
        "Regional road",
        "SOS lay-by",
        "Town or village",
        "Traffic calming",
        "100m to next exit",
        "200m to next exit",
        "300m to next exit",
        "Advance direction sign for destination",
        "Advance direction sign",
        "Entry to motorway",
        "Motorway ahead",
        "Motorway ends 1km ahead",
        "Motorway ends 500m ahead",
        "Route confirmatory sign for M7",
        "Bus lane on left",
        "Bus only street",
        "Clearway",
        "Disk Parking",
        "Electronic periodic speed limit sign",
        "Electronic variable speed limit sign (tunnel only)",
        "End of cycle track",
        "End of the restriction zone",
        "Height Restriction",
        "In a tunnel goods vehicles cannot use right-hand lane (by reference to number of axles)",
        "Max speed limit 30kph",
        "Max speed limit 120kph",
        "No entry for pedestrians to tramway",
        "No entry to goods vehicles (by reference to number of axles)",
        "No entry",
        "No Left Turn",
        "No overtaking",
        "No right turn",
        "No U Turn",
        "Parking permitted",
        "Parking prohibited",
        "Pedestrianised street",
        "School wardens stop sign",
        "Start of cycle track",
        "Stop",
        "Taxi Rank",
        "Tram lane on right",
        "Tram only street",
        "Weight Restriction",
        "Yield en",
        "Yield ir",
        "Zonal restriction - no parking of large vehicles",
        "Advance direction to local services",
        "Advance sign for lay-by with tourism information",
        "Oige youth hostels",
        "Pedestrian sign to a car park",
        "Pedestrian sign to a tourist attraction",
        "Sign to approved tourist information point",
        "Tourist advanced direction sign",
        "Tourist attraction direction sign",
        "Accompanied horses and ponies",
        "Cattle and farm animals",
        "Crosswinds",
        "Deer or wild animals",
        "Drive on left",
        "Level crossing ahead with lights and barriers",
        "Low flying aircraft",
        "Overhead electric cables",
        "Pedestrian crossing ahead",
        "Sharp dip ahead",
        "Sharp rise ahead e.g. hump-back bridge",
        "Slippery road ahead",
        "Steep descent ahead",
        "Traffic signals ahead",
        "Tunnel ahead",
        "Unprotected quay, canal or river ahead",
        "Diverted traffic left",
        "Flagman ahead",
        "Loose chippings",
        "Queues likely",
        "Roadworks ahead",
        "Site access on left",
        "Uneven surface",
        "Dangerous bend ahead",
        "Dangerous corner ahead",
        "Merging traffic",
        "Mini-Roundabout ahead",
        "Restricted headroom",
        "Roundabout ahead",
        "Series of dangerous bends ahead",
        "Series of dangerous corners ahead",
        "Two-way traffic"};

    String SignAnswersDE[] = {
        "Vorabschild für geringe Bodenfreiheit",
        "Flughafen",
        "Alternative Route für hohe Fahrzeuge",
        "Sackgasse",
        "Zielentfernung",
        "Behindertenparkplatz",
        "Fähre",
        "Krankenhausschild",
        "Autobahn",
        "Nationalstraße",
        "Regionale Straßenrichtung",
        "Regionale Straße",
        "SOS-Aufenthalt",
        "Stadt oder Dorf",
        "Verkehrsberuhigung",
        "100m bis zur nächsten Ausfahrt",
        "200m bis zur nächsten Ausfahrt",
        "300m bis zur nächsten Ausfahrt",
        "Vorfahrtrichtung für Ziel",
        "Vorzeichen",
        "Zugang zur Autobahn",
        "Autobahn voraus",
        "Autobahn endet 1 km voraus",
        "Autobahn endet 500m voraus",
        "Bestätigungszeichen der Route für M7",
        "Busspur links",
        "Nur Bus Straße",
        "Clearway",
        "Festplattenparken",
        "Elektronisches Geschwindigkeitsbegrenzungszeichen",
        "Elektronisches Geschwindigkeitsbegrenzungszeichen (nur Tunnel)",
        "Ende der Fahrradstrecke",
        "Ende der Sperrzone",
        "Höhenbeschränkung",
        "In einem Tunnel können Lastkraftwagen die rechte Spur nicht benutzen (bezogen auf die Anzahl der Achsen)",
        "Höchstgeschwindigkeit 30 km / h",
        "Höchstgeschwindigkeit 120 km / h",
        "Kein Zugang für Fußgänger zur Straßenbahn",
        "Kein Zugang zu Lastkraftwagen (bezogen auf die Anzahl der Achsen)",
        "Kein Einlass",
        "Keine Linkskurve",
        "Kein Überholen",
        "Rechts abbiegen verboten",
        "Nicht wenden",
        "Parken erlaubt",
        "Parken verboten",
        "Fußgängerzone",
        "Schulhüter stoppen Zeichen",
        "Start des Radwegs",
        "Halt",
        "Taxistand",
        "Straßenbahnspur rechts",
        "Straßenbahn nur Straße",
        "Gewichtsbeschränkung",
        "Ertrag en",
        "Ertrag ir",
        "Zonenbeschränkung - kein Parken großer Fahrzeuge",
        "Vorausleitung zu lokalen Diensten",
        "Vorzeichen für die Auslagerung mit Tourismusinformationen",
        "Oige Jugendherbergen",
        "Fußgängerzeichen zu einem Parkplatz",
        "Fußgängerzeichen zu einer Touristenattraktion",
        "Unterschreiben Sie bei der anerkannten Touristeninformation",
        "Touristisches vorgeschobenes Wegweiser",
        "Touristenattraktion Wegweiser",
        "Begleitete Pferde und Ponys",
        "Rinder und Nutztiere",
        "Seitenwind",
        "Hirsche oder wilde Tiere",
        "Fahren Sie links",
        "Bahnübergang mit Lichtern und Barrieren",
        "Tieffliegendes Flugzeug",
        "Elektrische Stromkabel",
        "Fußgängerüberweg",
        "Scharfe Dip voraus",
        "Scharfe Erhebung, beispielsweise Buckelbrücke",
        "Rutschige Straße voraus",
        "Steile Abfahrt",
        "Verkehrszeichen voraus",
        "Tunnel voraus",
        "Ungeschützter Kai, Kanal oder Fluss voraus",
        "Umgeleiteter Verkehr links",
        "Flagman voraus",
        "Lose Späne",
        "Warteschlangen wahrscheinlich",
        "Baustelle voraus",
        "Site Zugriff auf der linken Seite",
        "Unebene Oberfläche",
        "Gefährliche Biegung voraus",
        "Gefährliche Ecke voraus",
        "Verkehr zusammenführen",
        "Mini-Kreisverkehr voraus",
        "Eingeschränkte Kopffreiheit",
        "Kommender Kreisverkehr",
        "Reihe gefährlicher Kurven voraus",
        "Reihe gefährlicher Ecken voraus",
        "Verkehr in zwei Richtungen"};

    String SignAnswersFR[] = {
        "Panneau d’information préalable pour faible jeu",
        "Aéroport",
        "Itinéraire alternatif pour les véhicules hauts",
        "Cul-de-sac",
        "Distance de destination",
        "Place de stationnement pour personnes handicapées",
        "Traversier",
        "Signe de l'hôpital",
        "Autoroute",
        "Route nationale",
        "Direction de route régionale",
        "Route régionale",
        "SOS lay-by",
        "Ville ou village",
        "Apaisement de la circulation",
        "100m jusqu'à la prochaine sortie",
        "200m jusqu'à la prochaine sortie",
        "300m jusqu'à la prochaine sortie",
        "Panneau de direction avancé pour la destination",
        "Panneau de direction avancé",
        "Entrée de l'autoroute",
        "Autoroute en avant",
        "L'autoroute se termine 1 km plus loin",
        "L'autoroute se termine 500m devant",
        "Panneau de confirmation de route pour M7",
        "Voie de bus à gauche",
        "Rue uniquement bus",
        "Clearway",
        "Parking de disque",
        "Panneau électronique de limitation de vitesse périodique",
        "Panneau électronique de limitation de vitesse variable (tunnel uniquement)",
        "Fin de piste cyclable",
        "Fin de la zone de restriction",
        "Restriction de hauteur",
        "Dans un tunnel, les véhicules de transport de marchandises ne peuvent pas utiliser la voie de droite (en fonction du nombre d'essieux)",
        "Limite de vitesse maximale 30 km / h",
        "Limite de vitesse maximale 120 km / h",
        "Pas de passage des piétons au tramway",
        "Aucune inscription dans les véhicules de transport de marchandises (en fonction du nombre d'essieux)",
        "Entrée interdite",
        "Pas de virage à gauche",
        "Interdiction de dépasser",
        "Pas de virage à droite",
        "Ce n'est pas ton tour",
        "Parking autorisé",
        "Parking interdit",
        "Rue piétonne",
        "Panneau d'arrêt des gardes d'école",
        "Début de piste cyclable",
        "Arrêtez",
        "Rang de taxi",
        "Voie de tram à droite",
        "Tram seule rue",
        "Limitation de poids",
        "Rendement en",
        "Rendement ir",
        "Restriction de zone - pas de stationnement de gros véhicules",
        "Direction avancée des services locaux",
        "Panneau de signalisation préalable avec informations touristiques",
        "Auberges de jeunesse Oige",
        "Panneau pour piétons vers un parking",
        "Panneau pour piétons à une attraction touristique",
        "Signer au point d'information touristique approuvé",
        "Panneau de signalisation touristique avancé",
        "Panneau de direction d'attraction touristique",
        "Chevaux et poneys accompagnés",
        "Bétail et animaux de la ferme",
        "Vents de travers",
        "Cerf ou animaux sauvages",
        "Conduire à gauche",
        "Passage à niveau avec feux et barrières",
        "Avion volant à basse altitude",
        "Câbles électriques aériens",
        "Passage piéton devant",
        "Piqué en avant",
        "Forte avance, par exemple pont à dos d'âne",
        "Route glissante droit devant",
        "Descente raide devant nous",
        "Les feux de circulation à venir",
        "Tunnel en avant",
        "Quai, canal ou rivière non protégés devant vous",
        "Trafic dévié à gauche",
        "Flagman à venir",
        "Copeaux en vrac",
        "Files d'attente probables",
        "Travaux en avant",
        "Accès au site à gauche",
        "Une surface irrégulière",
        "Courbure dangereuse en avant",
        "Coin dangereux à venir",
        "Fusionner le trafic",
        "Mini rond-point à venir",
        "Espace libre restreint",
        "Rond point devant",
        "Série de virages dangereux en avant",
        "Série de virages dangereux à venir",
        "Trafic à double sens"};

    int answersGuessedRight;
    int answersGuessedWrong;
    String ans;
    int askedQuestions = 0;
    Random rand = new Random();
    DateFormat f = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT, Locale.getDefault());
    String formattedDate = f.format(new Date());

    

    /**
     * Creates new form driversEd
     */
    public driversEd() throws InterruptedException {
        initComponents();
        populateLists();
        time.setText(formattedDate);
        time1.setText(formattedDate);
        time2.setText(formattedDate);
        time3.setText(formattedDate);
        
        Thread.sleep(3000);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SplashScreen = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        MainEN = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        question = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        answers = new javax.swing.JPanel();
        ans1 = new javax.swing.JButton();
        ans2 = new javax.swing.JButton();
        ans3 = new javax.swing.JButton();
        ans4 = new javax.swing.JButton();
        time1 = new javax.swing.JLabel();
        MainDE = new javax.swing.JPanel();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        question2 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        answers2 = new javax.swing.JPanel();
        ans9 = new javax.swing.JButton();
        ans10 = new javax.swing.JButton();
        ans11 = new javax.swing.JButton();
        ans12 = new javax.swing.JButton();
        time2 = new javax.swing.JLabel();
        MainFR = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        question1 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        answers1 = new javax.swing.JPanel();
        ans5 = new javax.swing.JButton();
        ans6 = new javax.swing.JButton();
        ans7 = new javax.swing.JButton();
        ans8 = new javax.swing.JButton();
        time3 = new javax.swing.JLabel();
        Finish = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Drivers Education");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new java.awt.CardLayout());

        SplashScreen.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DRIVERS EDUCATION");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.GridLayout(1, 3, 10, 0));

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setIcon(new javax.swing.ImageIcon("C:\\Users\\K00200540\\Documents\\GitHub\\K00200540\\DriversEducationAssignment1\\src\\images\\icons\\if_France_flat_92086.png")); // NOI18N
        jButton7.setBorder(null);
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7);

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setIcon(new javax.swing.ImageIcon("C:\\Users\\K00200540\\Documents\\GitHub\\K00200540\\DriversEducationAssignment1\\src\\images\\icons\\if_Germany_flat_92094.png")); // NOI18N
        jButton8.setBorder(null);
        jButton8.setBorderPainted(false);
        jButton8.setContentAreaFilled(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton8);

        jButton9.setBackground(new java.awt.Color(255, 255, 255));
        jButton9.setIcon(new javax.swing.ImageIcon("C:\\Users\\K00200540\\Documents\\GitHub\\K00200540\\DriversEducationAssignment1\\src\\images\\icons\\if_United-Kingdom_flat_92402.png")); // NOI18N
        jButton9.setBorder(null);
        jButton9.setBorderPainted(false);
        jButton9.setContentAreaFilled(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton9);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("PLEASE SELECT LANGUAGE THEN PRESS START TO CONTIUNE:");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/69796a2003e3a937d36a375b601f2eac.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(295, 295, 295)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(315, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(137, 137, 137))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout SplashScreenLayout = new javax.swing.GroupLayout(SplashScreen);
        SplashScreen.setLayout(SplashScreenLayout);
        SplashScreenLayout.setHorizontalGroup(
            SplashScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SplashScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SplashScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(SplashScreenLayout.createSequentialGroup()
                        .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(77, 77, 77)))
                .addContainerGap())
        );
        SplashScreenLayout.setVerticalGroup(
            SplashScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SplashScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SplashScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addGroup(SplashScreenLayout.createSequentialGroup()
                        .addComponent(time, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(2, 2, 2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(SplashScreen, "card2");

        MainEN.setBackground(new java.awt.Color(255, 255, 255));

        jButton3.setText("NEXT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("FINISH");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("DRIVERS EDUCATION");

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        question.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\K00200540\\Documents\\GitHub\\K00200540\\DriversEducationAssignment1\\src\\images\\Road Signs\\Information Signs\\1.gif")); // NOI18N
        jLabel8.setMaximumSize(new java.awt.Dimension(183, 196));

        javax.swing.GroupLayout questionLayout = new javax.swing.GroupLayout(question);
        question.setLayout(questionLayout);
        questionLayout.setHorizontalGroup(
            questionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        questionLayout.setVerticalGroup(
            questionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
        );

        answers.setBackground(new java.awt.Color(255, 255, 255));
        answers.setLayout(new java.awt.GridLayout(2, 2, 10, 10));

        ans1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ans1ActionPerformed(evt);
            }
        });
        answers.add(ans1);

        ans2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ans2ActionPerformed(evt);
            }
        });
        answers.add(ans2);

        ans3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ans3ActionPerformed(evt);
            }
        });
        answers.add(ans3);

        ans4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ans4ActionPerformed(evt);
            }
        });
        answers.add(ans4);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(answers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(question, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(question, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(answers, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout MainENLayout = new javax.swing.GroupLayout(MainEN);
        MainEN.setLayout(MainENLayout);
        MainENLayout.setHorizontalGroup(
            MainENLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainENLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MainENLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(MainENLayout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4))
                    .addGroup(MainENLayout.createSequentialGroup()
                        .addComponent(time1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        MainENLayout.setVerticalGroup(
            MainENLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainENLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MainENLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(time1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(92, 92, 92)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(MainEN, "card2");

        MainDE.setBackground(new java.awt.Color(255, 255, 255));

        jButton12.setText("NEXT");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setText("FINISH");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("DRIVERS EDUCATION");

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        question2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon("C:\\Users\\K00200540\\Documents\\GitHub\\K00200540\\DriversEducationAssignment1\\src\\images\\Road Signs\\Information Signs\\1.gif")); // NOI18N
        jLabel19.setMaximumSize(new java.awt.Dimension(183, 196));

        javax.swing.GroupLayout question2Layout = new javax.swing.GroupLayout(question2);
        question2.setLayout(question2Layout);
        question2Layout.setHorizontalGroup(
            question2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        question2Layout.setVerticalGroup(
            question2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
        );

        answers2.setBackground(new java.awt.Color(255, 255, 255));
        answers2.setLayout(new java.awt.GridLayout(2, 2, 10, 10));

        ans9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ans9ActionPerformed(evt);
            }
        });
        answers2.add(ans9);

        ans10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ans10ActionPerformed(evt);
            }
        });
        answers2.add(ans10);

        ans11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ans11ActionPerformed(evt);
            }
        });
        answers2.add(ans11);

        ans12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ans12ActionPerformed(evt);
            }
        });
        answers2.add(ans12);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(answers2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(question2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(question2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(answers2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout MainDELayout = new javax.swing.GroupLayout(MainDE);
        MainDE.setLayout(MainDELayout);
        MainDELayout.setHorizontalGroup(
            MainDELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainDELayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MainDELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(MainDELayout.createSequentialGroup()
                        .addComponent(jButton12)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton13))
                    .addGroup(MainDELayout.createSequentialGroup()
                        .addComponent(time2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        MainDELayout.setVerticalGroup(
            MainDELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainDELayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MainDELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton12)
                    .addComponent(jButton13)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(time2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(92, 92, 92)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(MainDE, "card2");

        MainFR.setBackground(new java.awt.Color(255, 255, 255));

        jButton10.setText("NEXT");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("FINISH");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("DRIVERS EDUCATION");

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        question1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon("C:\\Users\\K00200540\\Documents\\GitHub\\K00200540\\DriversEducationAssignment1\\src\\images\\Road Signs\\Information Signs\\1.gif")); // NOI18N
        jLabel17.setMaximumSize(new java.awt.Dimension(183, 196));

        javax.swing.GroupLayout question1Layout = new javax.swing.GroupLayout(question1);
        question1.setLayout(question1Layout);
        question1Layout.setHorizontalGroup(
            question1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(question1Layout.createSequentialGroup()
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        question1Layout.setVerticalGroup(
            question1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(question1Layout.createSequentialGroup()
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                .addContainerGap())
        );

        answers1.setBackground(new java.awt.Color(255, 255, 255));
        answers1.setLayout(new java.awt.GridLayout(2, 2, 10, 10));

        ans5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ans5ActionPerformed(evt);
            }
        });
        answers1.add(ans5);

        ans6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ans6ActionPerformed(evt);
            }
        });
        answers1.add(ans6);

        ans7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ans7ActionPerformed(evt);
            }
        });
        answers1.add(ans7);

        ans8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ans8ActionPerformed(evt);
            }
        });
        answers1.add(ans8);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(answers1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(question1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(question1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(answers1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout MainFRLayout = new javax.swing.GroupLayout(MainFR);
        MainFR.setLayout(MainFRLayout);
        MainFRLayout.setHorizontalGroup(
            MainFRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainFRLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MainFRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(MainFRLayout.createSequentialGroup()
                        .addComponent(jButton10)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 607, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton11))
                    .addGroup(MainFRLayout.createSequentialGroup()
                        .addComponent(time3, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        MainFRLayout.setVerticalGroup(
            MainFRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainFRLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MainFRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10)
                    .addComponent(jButton11)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(time3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(MainFR, "card2");

        Finish.setBackground(new java.awt.Color(255, 255, 255));

        jButton5.setText("HOME");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("EXIT");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("DRIVERS EDUCATION");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("RESULTS");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cross.gif"))); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tick.gif"))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 100)); // NOI18N
        jLabel12.setText("0");

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 100)); // NOI18N
        jLabel13.setText("0");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(104, 104, 104))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(157, 157, 157))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(167, 167, 167)
                    .addComponent(jLabel13)
                    .addContainerGap(495, Short.MAX_VALUE)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addGap(116, 116, 116))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                    .addContainerGap(257, Short.MAX_VALUE)
                    .addComponent(jLabel13)
                    .addGap(106, 106, 106)))
        );

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Book your next theory test here! :- https://theorytest.ie/book-your-theory-test/driver-theory-test-car-bike-bus-or-truck/");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(71, 71, 71)
                .addComponent(jLabel14)
                .addContainerGap())
        );

        javax.swing.GroupLayout FinishLayout = new javax.swing.GroupLayout(Finish);
        Finish.setLayout(FinishLayout);
        FinishLayout.setHorizontalGroup(
            FinishLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FinishLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FinishLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(FinishLayout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 611, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton6)))
                .addContainerGap())
        );
        FinishLayout.setVerticalGroup(
            FinishLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FinishLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FinishLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(Finish, "card2");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ans4.setBorder(BorderFactory.createLineBorder(Color.gray));
        ans3.setBorder(BorderFactory.createLineBorder(Color.gray));
        ans2.setBorder(BorderFactory.createLineBorder(Color.gray));
        ans1.setBorder(BorderFactory.createLineBorder(Color.gray));
        if (askedQuestions < 4) {

            int randomNum = rand.nextInt(size);
            ans1.setText(SignAnswers[randomNum]);
            int randomNum1 = rand.nextInt(size);
            ans2.setText(SignAnswers[randomNum1]);
            int randomNum2 = rand.nextInt(size);
            ans3.setText(SignAnswers[randomNum2]);
            int randomNum3 = rand.nextInt(size);
            ans4.setText(SignAnswers[randomNum3]);

            Image image = new ImageIcon(this.getClass().getResource(questionImage.get(randomNum).toString())).getImage();
            ImageIcon icon = new ImageIcon(image);
            ans = SignAnswers[randomNum];
            jLabel8.setIcon(icon);

            askedQuestions++;
        } else {
            MainEN.setVisible(false);
            Finish.setVisible(true);
            jLabel13.setText(Integer.toString(answersGuessedWrong));
            jLabel12.setText(Integer.toString(answersGuessedRight));
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void ans3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ans3ActionPerformed
        if (ans3.getText() == ans) {
            answersGuessedRight += 1;
            ans3.setBorder(BorderFactory.createLineBorder(Color.green));
        } else {
            answersGuessedWrong += 1;
            ans3.setBorder(BorderFactory.createLineBorder(Color.red));
        }
    }//GEN-LAST:event_ans3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        SplashScreen.setVisible(true);
        Finish.setVisible(false);
        answersGuessedRight = 0;
        answersGuessedWrong = 0;
        askedQuestions = 0;
        ans4.setBorder(BorderFactory.createLineBorder(Color.gray));
        ans3.setBorder(BorderFactory.createLineBorder(Color.gray));
        ans2.setBorder(BorderFactory.createLineBorder(Color.gray));
        ans1.setBorder(BorderFactory.createLineBorder(Color.gray));
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        MainEN.setVisible(false);
        Finish.setVisible(true);
        jLabel13.setText(Integer.toString(answersGuessedWrong));
        jLabel12.setText(Integer.toString(answersGuessedRight));
    }//GEN-LAST:event_jButton4ActionPerformed

    private void ans1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ans1ActionPerformed
        if (ans1.getText() == ans) {
            answersGuessedRight += 1;
            ans1.setBorder(BorderFactory.createLineBorder(Color.green));
        } else {
            answersGuessedWrong += 1;
            ans1.setBorder(BorderFactory.createLineBorder(Color.red));
        }

    }//GEN-LAST:event_ans1ActionPerformed

    private void ans2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ans2ActionPerformed
        if (ans2.getText() == ans) {
            answersGuessedRight += 1;
            ans2.setBorder(BorderFactory.createLineBorder(Color.green));
        } else {
            answersGuessedWrong += 1;
            ans2.setBorder(BorderFactory.createLineBorder(Color.red));
        }
    }//GEN-LAST:event_ans2ActionPerformed

    private void ans4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ans4ActionPerformed
        if (ans4.getText() == ans) {
            answersGuessedRight += 1;
            ans4.setBorder(BorderFactory.createLineBorder(Color.green));
        } else {
            answersGuessedWrong += 1;
            ans4.setBorder(BorderFactory.createLineBorder(Color.red));
        }
    }//GEN-LAST:event_ans4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        SplashScreen.setVisible(false);
        MainFR.setVisible(true);

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        ans5.setBorder(BorderFactory.createLineBorder(Color.gray));
        ans6.setBorder(BorderFactory.createLineBorder(Color.gray));
        ans7.setBorder(BorderFactory.createLineBorder(Color.gray));
        ans8.setBorder(BorderFactory.createLineBorder(Color.gray));
        if (askedQuestions < 4) {

            int randomNum = rand.nextInt(size);
            ans5.setText(SignAnswersFR[randomNum]);
            int randomNum1 = rand.nextInt(size);
            ans6.setText(SignAnswersFR[randomNum1]);
            int randomNum2 = rand.nextInt(size);
            ans7.setText(SignAnswersFR[randomNum2]);
            int randomNum3 = rand.nextInt(size);
            ans8.setText(SignAnswersFR[randomNum3]);

            Image image = new ImageIcon(this.getClass().getResource(questionImage.get(randomNum).toString())).getImage();
            ImageIcon icon = new ImageIcon(image);
            ans = SignAnswersFR[randomNum];
            jLabel17.setIcon(icon);

            askedQuestions++;
        } else {
            MainFR.setVisible(false);
            Finish.setVisible(true);
            jLabel13.setText(Integer.toString(answersGuessedWrong));
            jLabel12.setText(Integer.toString(answersGuessedRight));
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        MainFR.setVisible(false);
        Finish.setVisible(true);
        jLabel13.setText(Integer.toString(answersGuessedWrong));
        jLabel12.setText(Integer.toString(answersGuessedRight));
    }//GEN-LAST:event_jButton11ActionPerformed

    private void ans5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ans5ActionPerformed
        if (ans5.getText() == ans) {
            answersGuessedRight += 1;
            ans5.setBorder(BorderFactory.createLineBorder(Color.green));
        } else {
            answersGuessedWrong += 1;
            ans5.setBorder(BorderFactory.createLineBorder(Color.red));
        }
    }//GEN-LAST:event_ans5ActionPerformed

    private void ans6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ans6ActionPerformed
        if (ans6.getText() == ans) {
            answersGuessedRight += 1;
            ans6.setBorder(BorderFactory.createLineBorder(Color.green));
        } else {
            answersGuessedWrong += 1;
            ans6.setBorder(BorderFactory.createLineBorder(Color.red));
        }
    }//GEN-LAST:event_ans6ActionPerformed

    private void ans7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ans7ActionPerformed
        if (ans7.getText() == ans) {
            answersGuessedRight += 1;
            ans7.setBorder(BorderFactory.createLineBorder(Color.green));
        } else {
            answersGuessedWrong += 1;
            ans7.setBorder(BorderFactory.createLineBorder(Color.red));
        }
    }//GEN-LAST:event_ans7ActionPerformed

    private void ans8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ans8ActionPerformed
        if (ans8.getText() == ans) {
            answersGuessedRight += 1;
            ans8.setBorder(BorderFactory.createLineBorder(Color.green));
        } else {
            answersGuessedWrong += 1;
            ans8.setBorder(BorderFactory.createLineBorder(Color.red));
        }
    }//GEN-LAST:event_ans8ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        ans9.setBorder(BorderFactory.createLineBorder(Color.gray));
        ans10.setBorder(BorderFactory.createLineBorder(Color.gray));
        ans11.setBorder(BorderFactory.createLineBorder(Color.gray));
        ans12.setBorder(BorderFactory.createLineBorder(Color.gray));
        if (askedQuestions < 4) {

            int randomNum = rand.nextInt(size);
            ans9.setText(SignAnswersDE[randomNum]);
            int randomNum1 = rand.nextInt(size);
            ans10.setText(SignAnswersDE[randomNum1]);
            int randomNum2 = rand.nextInt(size);
            ans11.setText(SignAnswersDE[randomNum2]);
            int randomNum3 = rand.nextInt(size);
            ans12.setText(SignAnswersDE[randomNum3]);

            Image image = new ImageIcon(this.getClass().getResource(questionImage.get(randomNum).toString())).getImage();
            ImageIcon icon = new ImageIcon(image);
            ans = SignAnswersDE[randomNum];
            jLabel19.setIcon(icon);

            askedQuestions++;
        } else {
            MainDE.setVisible(false);
            Finish.setVisible(true);
            jLabel13.setText(Integer.toString(answersGuessedWrong));
            jLabel12.setText(Integer.toString(answersGuessedRight));
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        MainDE.setVisible(false);
        Finish.setVisible(true);
        jLabel13.setText(Integer.toString(answersGuessedWrong));
        jLabel12.setText(Integer.toString(answersGuessedRight));
    }//GEN-LAST:event_jButton13ActionPerformed

    private void ans9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ans9ActionPerformed
        if (ans9.getText() == ans) {
            answersGuessedRight += 1;
            ans9.setBorder(BorderFactory.createLineBorder(Color.green));
        } else {
            answersGuessedWrong += 1;
            ans9.setBorder(BorderFactory.createLineBorder(Color.red));
        }
    }//GEN-LAST:event_ans9ActionPerformed

    private void ans10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ans10ActionPerformed
        if (ans10.getText() == ans) {
            answersGuessedRight += 1;
            ans10.setBorder(BorderFactory.createLineBorder(Color.green));
        } else {
            answersGuessedWrong += 1;
            ans10.setBorder(BorderFactory.createLineBorder(Color.red));
        }
    }//GEN-LAST:event_ans10ActionPerformed

    private void ans11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ans11ActionPerformed
        if (ans11.getText() == ans) {
            answersGuessedRight += 1;
            ans11.setBorder(BorderFactory.createLineBorder(Color.green));
        } else {
            answersGuessedWrong += 1;
            ans11.setBorder(BorderFactory.createLineBorder(Color.red));
        }
    }//GEN-LAST:event_ans11ActionPerformed

    private void ans12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ans12ActionPerformed
        if (ans12.getText() == ans) {
            answersGuessedRight += 1;
            ans12.setBorder(BorderFactory.createLineBorder(Color.green));
        } else {
            answersGuessedWrong += 1;
            ans12.setBorder(BorderFactory.createLineBorder(Color.red));
        }
    }//GEN-LAST:event_ans12ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        SplashScreen.setVisible(false);
        MainDE.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        SplashScreen.setVisible(false);
        MainEN.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    /**
     * @param args the command line arguments
     */
    public void populateLists() {
        for (int i = 1; i < 16; i++) {
            questionImage.add(informationSign + i + ".gif");
        }
        for (int i = 1; i < 11; i++) {
            questionImage.add(motorwaySign + i + ".gif");
        }
        for (int i = 1; i < 33; i++) {
            questionImage.add(regularSign + i + ".gif");
        }
        for (int i = 1; i < 9; i++) {
            questionImage.add(touristSign + i + ".gif");
        }
        for (int i = 1; i < 17; i++) {
            questionImage.add(warningSignGen + i + ".gif");
        }
        for (int i = 1; i < 8; i++) {
            questionImage.add(warningSignRW + i + ".gif");
        }
        for (int i = 1; i < 10; i++) {
            questionImage.add(warningSignWT + i + ".gif");
        }

    }

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
            java.util.logging.Logger.getLogger(driversEd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(driversEd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(driversEd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(driversEd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new driversEd().setVisible(true);
                } catch (InterruptedException ex) {
                    Logger.getLogger(driversEd.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Finish;
    private javax.swing.JPanel MainDE;
    private javax.swing.JPanel MainEN;
    private javax.swing.JPanel MainFR;
    private javax.swing.JPanel SplashScreen;
    private javax.swing.JButton ans1;
    private javax.swing.JButton ans10;
    private javax.swing.JButton ans11;
    private javax.swing.JButton ans12;
    private javax.swing.JButton ans2;
    private javax.swing.JButton ans3;
    private javax.swing.JButton ans4;
    private javax.swing.JButton ans5;
    private javax.swing.JButton ans6;
    private javax.swing.JButton ans7;
    private javax.swing.JButton ans8;
    private javax.swing.JButton ans9;
    private javax.swing.JPanel answers;
    private javax.swing.JPanel answers1;
    private javax.swing.JPanel answers2;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel question;
    private javax.swing.JPanel question1;
    private javax.swing.JPanel question2;
    private javax.swing.JLabel time;
    private javax.swing.JLabel time1;
    private javax.swing.JLabel time2;
    private javax.swing.JLabel time3;
    // End of variables declaration//GEN-END:variables
}
