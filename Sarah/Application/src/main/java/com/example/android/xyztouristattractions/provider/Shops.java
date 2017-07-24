package com.example.android.xyztouristattractions.provider;

import android.net.Uri;

import com.example.android.xyztouristattractions.common.Shop;
import com.google.android.gms.location.Geofence;
import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.SphericalUtil;
import com.example.android.xyztouristattractions.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Static data content provider.
 */
public class Shops {

    public static final String CITY_IASI = "Iasi";

    public static final String TEST_CITY = CITY_IASI;

    private static final float TRIGGER_RADIUS = 2000; // 2KM
    private static final int TRIGGER_TRANSITION = Geofence.GEOFENCE_TRANSITION_ENTER |
            Geofence.GEOFENCE_TRANSITION_EXIT;
    private static final long EXPIRATION_DURATION = Geofence.NEVER_EXPIRE;

    public static final Map<String, LatLng> CITY_LOCATIONS = new HashMap<String, LatLng>() {{
        put(CITY_IASI, new LatLng(47.174109, 27.575538));
    }};

    /**
     * All photos used with permission under the Creative Commons Attribution-ShareAlike License.
     */
    public static final HashMap<String, List<Shop>> SHOPS =
            new HashMap<String, List<Shop>>() {{

        put(CITY_IASI, new ArrayList<Shop>() {{
            add(new Shop(
                    "Profi Independentei",
                    "Independentei",
                    "Profi Independentei\nprofi.ro\n00:00-24:00",
                    "Acționând într-un mediu economic foarte competitiv, în care granițele tradiționale dintre magazinele discount, supermarketuri și hipermarketuri devin tot mai puțin relevante, magazinele PROFI se remarcă printr-un model de afaceri propriu, un mix de produse de calitate, promoții atrăgătoare, prospețime și accesibilitate, toate în imediata proximitate a clienților lor.\n\nTotodată, magazinele PROFI acționează ca un bun vecin care își asumă un rol social. PROFI a campania “Profi te premiază!”, acțiune în care compania și partenerii săi au investit peste un milion și jumătate de euro pentru a dota aproape 400 de școli cu 5381 de calculatoare legate în rețea, și alte 226 de școli cu tot atâtea videoproiectoare. Campania a fost desfășurată de-a lungul a trei ani consecutivi – 2011, 2012, 2013, si a avut Ministerul Educației Nationale ca partener. \n\nÎn următorii doi ani, 2014 și 2015 o nouă campanie, mai amplă, intitulată Împreună cu tine, PROFI salvează destine, s-a desfașurat în parteneriat cu zeci de ONG-uri, contribuind la reabilitarea unor spitale de copii, la desfășurarea unor misiuni medicale prin care zeci de copii au fost operați pe cord, la instruirea unor familii foarte nevoiașe din nordul țării, cărora li s-au oferit si animale domestice astfel încât să își poată asigura hrana și să ducă un trai decent, sau la ajutorarea copiilor care suferă de autism.\n",
                    "0372890873",
                    R.mipmap.profi,
                    R.mipmap.profi,
                    new LatLng(47.168884, 27.579199),
                    CITY_IASI
            ));

            add(new Shop(
                    "Billa Gara",
                    "Arcu 29",
                    "Șoseaua Arcu 29, Iași 700132\nbilla.ro\n07:00-23:00",
                    "În fiecare dintre magazinele noastre poți găsi o gamă largă de produse pentru ca tu să găsești toate lucrurile de care ai nevoie în fiecare zi pentru casa și familia ta: de la fructe și legume, carne, mezeluri, produse de brutărie și panificație, lactate și până la articole de menaj, curățenie și îngrijire corporală. Toate sunt sub același acoperiș!\n" +
                            "\n" +
                            "La noi, prospețimea și calitatea produselor sunt mereu pe primul loc! Avem grijă să îți oferim cele mai proaspete legume și fructe, carne proaspăt tranșată în propriile măcelării, salate și preparate calde, pregătite cu grijă în magazine sau produse de panificație și patiserie abia scoase din cuptor.\n" +
                            "\n" +
                            "Avem întotdeauna prețuri avantajoase pentru tine, datorită magazinelor în care organizăm munca eficient și achiziționăm cantități mari de produse!\n" +
                            "\n" +
                            "Interiorul fiecărui magazin a fost gândit astfel încât tu să poți avea parte de o experiență cât mai plăcută posibil și să găsești, cu cât mai mare ușurință, produsele de care ai nevoie.",
                    "0232264314",
                    R.mipmap.billa,
                    R.mipmap.billa,
                    new LatLng(47.168851, 27.568439),
                    CITY_IASI
            ));

            add(new Shop(
                    "Lidl Canta",
                    "Niciman 2",
                    "Strada Niciman 2, Iași 700521\nlidl.ro\n07:30-22:00",
                    "Fiind o companie internaţională suntem conştienţi de dimensiunea şi de prezenţa noastră publică.\n" +
                            "\n" +
                            "Respectăm multitudinea de culturi şi apreciem diversitatea valorilor şi a tradiţiilor acestora.\n" +
                            "\n" +
                            "Munca noastră este definită de principiile companiei şi de normele de comportament.\n" +
                            "\n" +
                            "Clientul nostru este cea mai importantă persoană pentru compania noastră. Acesta se află în centrul activităţii noastre, dezvoltarea companiei fiind subordonată dorinţelor sale.\n" +
                            "\n" +
                            "Punem la dispoziţia clienţilor noştri, în orice moment, toată gama de produse din sortimentul nostru si tratăm clienţii cu amabilitate, respect şi onestitate.",
                    "0800896622",
                    R.mipmap.lidl,
                    R.mipmap.lidl,
                    new LatLng(47.172855, 27.558335),
                    CITY_IASI
            ));

            add(new Shop(
                    "Profi Copou",
                    "Carol I",
                    "Bulevardul Carol I 48, Iași 707023\nprofi.ro\n07:00-23:00",
                    "Acționând într-un mediu economic foarte competitiv, în care granițele tradiționale dintre magazinele discount, supermarketuri și hipermarketuri devin tot mai puțin relevante, magazinele PROFI se remarcă printr-un model de afaceri propriu, un mix de produse de calitate, promoții atrăgătoare, prospețime și accesibilitate, toate în imediata proximitate a clienților lor.\n\nTotodată, magazinele PROFI acționează ca un bun vecin care își asumă un rol social. PROFI a campania “Profi te premiază!”, acțiune în care compania și partenerii săi au investit peste un milion și jumătate de euro pentru a dota aproape 400 de școli cu 5381 de calculatoare legate în rețea, și alte 226 de școli cu tot atâtea videoproiectoare. Campania a fost desfășurată de-a lungul a trei ani consecutivi – 2011, 2012, 2013, si a avut Ministerul Educației Nationale ca partener. \n\nÎn următorii doi ani, 2014 și 2015 o nouă campanie, mai amplă, intitulată Împreună cu tine, PROFI salvează destine, s-a desfașurat în parteneriat cu zeci de ONG-uri, contribuind la reabilitarea unor spitale de copii, la desfășurarea unor misiuni medicale prin care zeci de copii au fost operați pe cord, la instruirea unor familii foarte nevoiașe din nordul țării, cărora li s-au oferit si animale domestice astfel încât să își poată asigura hrana și să ducă un trai decent, sau la ajutorarea copiilor care suferă de autism.\n",
                    "0736622754",
                    R.mipmap.profi,
                    R.mipmap.profi,
                    new LatLng(47.180015, 27.569041),
                    CITY_IASI
            ));

            add(new Shop(
                    "Auchan Pallas Mall",
                    "Palas",
                    "Palas Mall, Strada Palas 5C\nauchan.ro\n08:00-23:00",
                    "O companie Discount si Rentabila, Moderna si Responsabila, cu colaboratori talentati, profesionisti, pasionati si pregatiti sa asculte clientul, pentru a cuceri impreuna inima clientilor nostri si pentru a face din Auchan magazinul preferat al tuturor romanilor!\n" +
                            "\n" +
                            "Angajamentele pe care Auchan si le-a asumat in favoarea clientilor sai au in vedere protejarea puterii de cumparare, calitatea si siguranta alimentelor si confortul la cumparaturi.\n" +
                            "\n" +
                            "Initiative in favoarea puterii de cumparare:\n" +
                            "Preturi mici pentru toate produsele din gama, permanent\n" +
                            "Produsele marca Auchan\n" +
                            "Oferta larga de produse alimentare sau nealimentare vandute la vrac\n" +
                            "Conditionarile in cantitati mici, respectiv vanzarile la unitate\n" +
                            "\n" +
                            "Demersuri pentru o alimentatie sanatoasa: procedurile HACCP pentru a garanta calitatea produselor proaspete; dezvoltarea continua a gamelor de produse bio, fara gluten, produse traditionale, locale etc.; dezvoltarea gamei de produse marca proprie realizate in Romania, sub supravegherea unui responsabil de asigurare a calitatii.\n" +
                            "\n" +
                            "Confortul la cumparaturi: construim magazine mari, usor accesibile, cu alei largi, rafturi bine organizate si un numar foarte mare de case de marcat, pentru a ajuta clientii sa se simta bine si confortabil la cumparaturi si sa castige timp.",
                    "0232421895",
                    R.mipmap.auchan,
                    R.mipmap.auchan,
                    new LatLng(47.155288, 27.589333),
                    CITY_IASI
            ));

            add(new Shop(
                    "Kaufland Podu de Piatra",
                    "Pavlov 14",
                    "Strada I. P. Pavlov 14, Iași 700010\nkaufland.ro\n07:00-22:00",
                    "Satisfacţia clientului se află în centrul activităţii noastre zilnice. Deoarece noi suntem mulțumiți numai atunci când clienții noștri sunt mulțumiți.\n" +
                            "\n" +
                            "În acest sens am dezvoltat pricipiile companiei și cultura organizațională. Avem convingerea că numai o echipă formată din angajați mulțumiți poate să îndeplinească așteptările clienților noștri.\n" +
                            "\n" +
                            "Cultura organizațională definește atitudinea colegială faţă de ceilalţi, precum şi un comportament de conducere orientat spre echipă. Acestea reprezintă premisele esenţiale care aduc bucurie angajaţilor noştri în fiecare zi.\n" +
                            "\n" +
                            "În principiile de conducere şi în cele conduită, care stau la baza culturii noastre organizaționale, sunt definite obiectivele şi aşteptările cu privire la o colaborare pe care o îmbunătățim continuu în cadrul echipei noastre de la Kaufland.",
                    "0372093801",
                    R.mipmap.kaufland,
                    R.mipmap.kaufland,
                    new LatLng(47.160925, 27.575599),
                    CITY_IASI
            ));

            add(new Shop(
                    "Billa Alexandru",
                    "Voievozilor 1",
                    "Piața Voievozilor 1, Iași 700575\nbilla.ro\n07:00-22:00",
                    "În fiecare dintre magazinele noastre poți găsi o gamă largă de produse pentru ca tu să găsești toate lucrurile de care ai nevoie în fiecare zi pentru casa și familia ta: de la fructe și legume, carne, mezeluri, produse de brutărie și panificație, lactate și până la articole de menaj, curățenie și îngrijire corporală. Toate sunt sub același acoperiș!\n" +
                            "\n" +
                            "La noi, prospețimea și calitatea produselor sunt mereu pe primul loc! Avem grijă să îți oferim cele mai proaspete legume și fructe, carne proaspăt tranșată în propriile măcelării, salate și preparate calde, pregătite cu grijă în magazine sau produse de panificație și patiserie abia scoase din cuptor.\n" +
                            "\n" +
                            "Avem întotdeauna prețuri avantajoase pentru tine, datorită magazinelor în care organizăm munca eficient și achiziționăm cantități mari de produse!\n" +
                            "\n" +
                            "Interiorul fiecărui magazin a fost gândit astfel încât tu să poți avea parte de o experiență cât mai plăcută posibil și să găsești, cu cât mai mare ușurință, produsele de care ai nevoie.",
                    "0374202487",
                    R.mipmap.billa,
                    R.mipmap.billa,
                    new LatLng(47.162918, 27.564172),
                    CITY_IASI
            ));

            add(new Shop(
                    "Profi Alexandru",
                    "Voievozilor 8",
                    "Piața Voievozilor 8, Iași\nprofi.ro\n00:00-24:00",
                    "Acționând într-un mediu economic foarte competitiv, în care granițele tradiționale dintre magazinele discount, supermarketuri și hipermarketuri devin tot mai puțin relevante, magazinele PROFI se remarcă printr-un model de afaceri propriu, un mix de produse de calitate, promoții atrăgătoare, prospețime și accesibilitate, toate în imediata proximitate a clienților lor.\n\nTotodată, magazinele PROFI acționează ca un bun vecin care își asumă un rol social. PROFI a campania “Profi te premiază!”, acțiune în care compania și partenerii săi au investit peste un milion și jumătate de euro pentru a dota aproape 400 de școli cu 5381 de calculatoare legate în rețea, și alte 226 de școli cu tot atâtea videoproiectoare. Campania a fost desfășurată de-a lungul a trei ani consecutivi – 2011, 2012, 2013, si a avut Ministerul Educației Nationale ca partener. \n\nÎn următorii doi ani, 2014 și 2015 o nouă campanie, mai amplă, intitulată Împreună cu tine, PROFI salvează destine, s-a desfașurat în parteneriat cu zeci de ONG-uri, contribuind la reabilitarea unor spitale de copii, la desfășurarea unor misiuni medicale prin care zeci de copii au fost operați pe cord, la instruirea unor familii foarte nevoiașe din nordul țării, cărora li s-au oferit si animale domestice astfel încât să își poată asigura hrana și să ducă un trai decent, sau la ajutorarea copiilor care suferă de autism.\n",
                    "0752844746",
                    R.mipmap.profi,
                    R.mipmap.profi,
                    new LatLng(47.160579, 27.565395),
                    CITY_IASI
            ));
        }});
    }};

    /**
     * Creates a list of geofences based on the city locations
     */
    public static List<Geofence> getGeofenceList() {
        List<Geofence> geofenceList = new ArrayList<Geofence>();
        for (String city : CITY_LOCATIONS.keySet()) {
            LatLng cityLatLng = CITY_LOCATIONS.get(city);
            geofenceList.add(new Geofence.Builder()
                    .setCircularRegion(cityLatLng.latitude, cityLatLng.longitude, TRIGGER_RADIUS)
                    .setRequestId(city)
                    .setTransitionTypes(TRIGGER_TRANSITION)
                    .setExpirationDuration(EXPIRATION_DURATION)
                    .build());
        }
        return geofenceList;
    }

    public static String getClosestCity(LatLng curLatLng) {
        if (curLatLng == null) {
            // If location is unknown return test city so some data is shown
            return TEST_CITY;
        }

        double minDistance = 0;
        String closestCity = null;
        for (Map.Entry<String, LatLng> entry: CITY_LOCATIONS.entrySet()) {
            double distance = SphericalUtil.computeDistanceBetween(curLatLng, entry.getValue());
            if (minDistance == 0 || distance < minDistance) {
                minDistance = distance;
                closestCity = entry.getKey();
            }
        }
        return closestCity;
    }
}
