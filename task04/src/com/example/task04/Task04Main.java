package com.example.task04;

import javax.security.auth.kerberos.KerberosTicket;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Locale;

public class Task04Main
{
    public static void main(String[] args) throws IOException
    {
        byte[] bytes = getBytes();
        String[] text = new String(bytes).split("[ \\n]");
        double sum = getSum(text);
        DecimalFormatSymbols decimalFormat = new DecimalFormatSymbols(Locale.getDefault());
        decimalFormat.setDecimalSeparator('.');
        String str = new DecimalFormat("#0.000000", decimalFormat).format(sum);
        System.out.println(str);
    }

    public static byte[] getBytes() throws IOException
    {
        int v;
        ArrayList<Byte> buffer = new ArrayList<>();
        while ((v = System.in.read()) != -1)
            buffer.add((byte) v);
        byte[] bytes = new byte[buffer.size()];
        for (int i = 0; i < buffer.size(); i++)
            bytes[i] = buffer.get(i);
        return bytes;
    }

    public static double getSum(String[] text)
    {
        double sum = 0;
        for (String e : text)
        {
            try
            {
                sum += Double.parseDouble(e);
            }
            catch (Exception exception)
            {
            }
        }
        return sum;
    }
}
