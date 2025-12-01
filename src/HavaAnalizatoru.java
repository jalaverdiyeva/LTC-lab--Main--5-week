import java.util.Arrays;


public class HavaAnalizatoru {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("        ->Bir həftəlik (7 gün) hava temperaturunu saxlayan və analiz edən proqram🌦️");
        System.out.println();

        //double tipində, ölçüsü 7 olan bir massiv yaradın (temperatures).

        double[]temperaturlar; temperaturlar=new double[7];
        String[]gunler = new String[7];

        //massivə həftənin hər günü üçün ixtiyari temperatur dəyərləri daxil edin (məsələn: 20.5, 22.1, 19.0 və s.).
        double[] heqiqiTemperaturlar={20.7, 21.5, 24.0, 19.5, 21.0, 25.1, 18.9};
        String[] gunAdlari={"Bazar ertəsi","Çərşənbə axşamı","Çərşənbə","Cümə axşamı","Cümə","Şənbə","Bazar"};

        System.out.println("🌟 7 günlük temperatur massivi yaradıldı");
        System.out.println("           (massiv uzunluğu: "+heqiqiTemperaturlar.length+")");
        System.out.println();

        //boş massivə dəyərləri tək-tək əlavə etmək
        temperaturlar[0]=20.7; //Bazar ertəsi
        temperaturlar[1]=21.5; //Çərşənbə axşamı
        temperaturlar[2]=24.0; //Çərşənbə
        temperaturlar[3]=19.5; //Cümə axşamı
        temperaturlar[4]=21.0; //Cümə
        temperaturlar[5]=25.1; //Şənbə
        temperaturlar[6]=18.9; //Bazar

        System.out.println("🌟 Bazar ertəsi -> "+temperaturlar[0]+"°C");
        System.out.println("🌟 Çərşənbə axşamı -> "+temperaturlar[1]+"°C");
        System.out.println("🌟 Çərşənbə -> "+temperaturlar[2]+"°C");
        System.out.println("🌟 Cümə axşamı -> "+temperaturlar[3]+"°C");
        System.out.println("🌟 Cümə -> "+temperaturlar[4]+"°C");
        System.out.println("🌟 Şənbə -> "+temperaturlar[5]+"°C");
        System.out.println("🌟 Bazar -> "+temperaturlar[6]+"°C");
        System.out.println();


        System.out.println("  ~elementlərə müraciət:");

        //birinci günün temperaturu (indeks 0)
        System.out.println("birinci gün (indeks 0): "+heqiqiTemperaturlar[0]+"°C");
        //sonuncu günün temperaturu (indeks length-1)
        int sonuncuIndeks = heqiqiTemperaturlar.length - 1;
        System.out.println("sonuncu gün (indeks "+sonuncuIndeks+"): "+heqiqiTemperaturlar[sonuncuIndeks]+"°C");
        //massivin uzunluğu
        System.out.println("massiv uzunluğu: "+heqiqiTemperaturlar.length+" gün");
        System.out.println();

        //   `for-each` və ya `for` dövründən istifadə edərək bu məlumatları emal edin və aşağıdakıları hesablayın:
        //    - **Orta temperatur:** Həftəlik temperaturun ədədi ortasını tapın.
        //    - **Ən isti gün:** Massivdəki ən yüksək temperaturu tapın.

        //--------------------------for--------------------------------
        System.out.println("🌟 for dövrü ilə massiv analizi:");
        double cemTemperatur=0;
        double enYuksekTemp=heqiqiTemperaturlar[0];
        double enAsagiTemp=heqiqiTemperaturlar[0];
        int enYuksekGun=0, enAsagiGun=0;

        //indeks lazım olduğu üçün adi for dövrü
        for (int i=0; i<heqiqiTemperaturlar.length; i++) {
            double temp=heqiqiTemperaturlar[i];
            cemTemperatur+=temp;//cəmi hesablama
            if (temp>enYuksekTemp){//en yüksək temperatur tapma
                enYuksekTemp=temp;
                enYuksekGun=i;
            }
            if (temp<enAsagiTemp){//en aşağı temperatur tapma
                enAsagiTemp=temp;
                enAsagiGun=i;
            }

            System.out.printf("İndeks %d (%s): %.1f°C%n",i,gunAdlari[i],temp);
        }

        double ortaTemperatur=cemTemperatur/heqiqiTemperaturlar.length;
        System.out.println("for ilə hesablanmış orta: "+ortaTemperatur);
        System.out.println("for ilə hesablanmış ən yüksək temperatur: "+enYuksekTemp+"°C");
        System.out.println("for ilə hesablanmış ən aşağı temperatur: "+enAsagiTemp+"°C");
        System.out.println();



        //--------------------------for-each--------------------------------
        System.out.println();
        System.out.println("🌟 for-each dövrü ilə sadə analiz:");
        double yeniCem=0;
        System.out.print("bütün temperaturlar: ");

        for (double temp:heqiqiTemperaturlar){ //indeks lazım olmadığı üçün for-each dövrü
            System.out.print(temp+"°C ");
            yeniCem+=temp;
        }
        System.out.println();
        System.out.println("for-each ilə hesablanmış orta: "+(yeniCem/heqiqiTemperaturlar.length));
        System.out.println();


        //----------------------YEKUN--------------------

        System.out.println("🌟 YEKUN         ");
        System.out.println(" ->temperaturlar: "+Arrays.toString(heqiqiTemperaturlar));
        System.out.printf("həftəlik orta temperatur: %.2f°C%n",ortaTemperatur);
        System.out.printf("ən yüksək temperatur:%.1f°C (%s)%n",enYuksekTemp,gunAdlari[enYuksekGun]);
        System.out.printf("ən aşağı temperatur: %.1f°C (%s)%n",enAsagiTemp,gunAdlari[enAsagiGun]);



    }

}
