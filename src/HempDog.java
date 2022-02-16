import org.apache.commons.codec.digest.DigestUtils;

public class HempDog {

    public static String hash = "2023afa4805b62ca3964f2c2f4edaf49";

    public static char min = 97;
    public static char max = 122;

    public static void main(String[] args) {

        combinacion();

    }


    public static String combinacion() {
        String combinacion = "";
        char uno = min;
        char dos = min;
        char tres = min;
        char cuatro = min;


            for (; cuatro <= max; cuatro++) {
                tres = min;
                for (; tres <= max; tres++) {
                    dos = min;
                    for (; dos <= max; dos++) {
                        uno = min;
                        for (; uno <= max; uno++) {
                            combinacion = "" + cuatro + tres + dos + uno;

                            if (hashCompute(combinacion).equals(hash)){
                                break;
                            }

                        }
                        if (hashCompute(combinacion).equals(hash)){
                            break;
                        }
                    }
                    if (hashCompute(combinacion).equals(hash)){
                        break;
                    }
                }
                if (hashCompute(combinacion).equals(hash)){
                    break;
                }
            }

        System.out.println(hashCompute(combinacion) + ":" + combinacion);


        return combinacion;
    }

    public static String hashCompute(String combinacion) {


        String md5Hex = DigestUtils
                .md5Hex(combinacion);


        return md5Hex;
    }

}