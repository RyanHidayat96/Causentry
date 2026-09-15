package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import com.google.common.base.Optional;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class zzjz {
    private static volatile Optional zza;

    public static Optional zza(Context context) {
        Optional optional;
        Optional optionalTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        Optional optionalTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Optional optional2 = zza;
        if (optional2 != null) {
            return optional2;
        }
        synchronized (zzjz.class) {
            optional = zza;
            if (optional == null) {
                String str = Build.TYPE;
                String str2 = Build.TAGS;
                int i = zzkb.zza;
                if ((str.equals("eng") || str.equals("userdebug")) && (str2.contains("dev-keys") || str2.contains("test-keys"))) {
                    if (zzjm.zza() && !context.isDeviceProtectedStorage()) {
                        context = context.createDeviceProtectedStorageContext();
                    }
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        StrictMode.allowThreadDiskWrites();
                        try {
                            File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
                            optionalTuitionPaymentFragmentspecialinlinedviewModeldefault2 = file.exists() ? Optional.TuitionPaymentFragmentspecialinlinedviewModeldefault2(file) : Optional.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        } catch (RuntimeException e2) {
                            Log.e("HermeticFileOverrides", "no data dir", e2);
                            optionalTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Optional.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        }
                        if (optionalTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1()) {
                            File file2 = (File) optionalTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            try {
                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
                                try {
                                    SimpleArrayMap simpleArrayMap = new SimpleArrayMap();
                                    HashMap map = new HashMap();
                                    while (true) {
                                        String line = bufferedReader.readLine();
                                        if (line == null) {
                                            break;
                                        }
                                        String[] strArrSplit = line.split(" ", 3);
                                        if (strArrSplit.length != 3) {
                                            StringBuilder sb = new StringBuilder(line.length() + 9);
                                            sb.append("Invalid: ");
                                            sb.append(line);
                                            Log.e("HermeticFileOverrides", sb.toString());
                                        } else {
                                            String str3 = new String(strArrSplit[0]);
                                            String strDecode = Uri.decode(new String(strArrSplit[1]));
                                            String strDecode2 = (String) map.get(strArrSplit[2]);
                                            if (strDecode2 == null) {
                                                String str4 = new String(strArrSplit[2]);
                                                strDecode2 = Uri.decode(str4);
                                                if (strDecode2.length() < 1024 || strDecode2 == str4) {
                                                    map.put(str4, strDecode2);
                                                }
                                            }
                                            SimpleArrayMap simpleArrayMap2 = (SimpleArrayMap) simpleArrayMap.get(str3);
                                            if (simpleArrayMap2 == null) {
                                                simpleArrayMap2 = new SimpleArrayMap();
                                                simpleArrayMap.put(str3, simpleArrayMap2);
                                            }
                                            simpleArrayMap2.put(strDecode, strDecode2);
                                        }
                                    }
                                    String string = file2.toString();
                                    String packageName = context.getPackageName();
                                    StringBuilder sb2 = new StringBuilder(string.length() + 28 + String.valueOf(packageName).length());
                                    sb2.append("Parsed ");
                                    sb2.append(string);
                                    sb2.append(" for Android package ");
                                    sb2.append(packageName);
                                    Log.w("HermeticFileOverrides", sb2.toString());
                                    zzjt zzjtVar = new zzjt(simpleArrayMap);
                                    bufferedReader.close();
                                    optionalTuitionPaymentFragmentspecialinlinedviewModeldefault3 = Optional.TuitionPaymentFragmentspecialinlinedviewModeldefault2(zzjtVar);
                                } catch (Throwable th) {
                                    try {
                                        bufferedReader.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            } catch (IOException e3) {
                                throw new RuntimeException(e3);
                            }
                        } else {
                            optionalTuitionPaymentFragmentspecialinlinedviewModeldefault3 = Optional.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        }
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    } catch (Throwable th3) {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        throw th3;
                    }
                } else {
                    optionalTuitionPaymentFragmentspecialinlinedviewModeldefault3 = Optional.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                }
                optional = optionalTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                zza = optional;
            }
        }
        return optional;
    }

    private zzjz() {
    }
}
