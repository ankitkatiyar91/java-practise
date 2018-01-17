package protobuf;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.CRC32;
import protobuf.QuickSilver.LicensingData;
import protobuf.QuickSilver.StaticData;
import com.google.protobuf.CodedOutputStream;

public class QuickSilverTest
{
    /**
     * pid: 252 lang: ENG-USA skup: 14159019
     * 
     * Key: "6C414D1D"
     * 
     * @param args
     */
    public static void main(String[] args)
    {
        try
        {
            /**
             * uint32 pid string lang string prodver string skup string skum string skuf uint32 xsku uint32 license_type
             * uint32 service_flags string psn string plang bool inject uint32 xlokvendor_id uint32 partnerunit_id
             */

            // create data
            LicensingData licData = LicensingData.newBuilder().setLang("ENG-USA").setPid(252).setSkup("14159019")
                    .setProdver("").setSkum("").setSkuf("").setXsku(0).setLicenseType(0).setServiceFlags(0).setPsn("")
                    .setPlang("").setInject(false).setXlokvendorId(0)
                    .setPartnerunitId(0)
                    .build();
            StaticData silver = QuickSilver.StaticData.newBuilder().setLicensingData(licData).build();

            System.out.println("Your Object Data: " + silver);

            // serialize your data
            ByteArrayOutputStream byteData = new ByteArrayOutputStream();
            silver.writeTo(byteData);
            byteData.flush();

            // encode your data
            CRC32 crc32 = new CRC32();
            crc32.update(byteData.toByteArray());
            System.out.println("hex: " + Long.toHexString(crc32.getValue()));
            System.out.println("HEX: " + Long.toHexString(crc32.getValue()).toUpperCase());

            // test second way serialize your data
            byteData = new ByteArrayOutputStream();
            CodedOutputStream output = CodedOutputStream.newInstance(byteData);
            silver.writeTo(output);
            byteData.flush();
            output.flush();

            crc32 = new CRC32();
            crc32.update(byteData.toByteArray());
            System.out.println("\nhex: " + Long.toHexString(crc32.getValue()));
            System.out.println("HEX: " + Long.toHexString(crc32.getValue()).toUpperCase());

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
