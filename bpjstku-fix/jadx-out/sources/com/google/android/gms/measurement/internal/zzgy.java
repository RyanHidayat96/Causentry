package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import defpackage.ViewPortBuilder;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
final class zzgy implements Runnable {
    final /* synthetic */ zzgz zza;
    private final URL zzb;
    private final byte[] zzc;
    private final zzgw zzd;
    private final String zze;
    private final Map zzf;

    public zzgy(zzgz zzgzVar, String str, URL url, byte[] bArr, Map map, zzgw zzgwVar) {
        Objects.requireNonNull(zzgzVar);
        this.zza = zzgzVar;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(url);
        Preconditions.checkNotNull(zzgwVar);
        this.zzb = url;
        this.zzc = bArr;
        this.zzd = zzgwVar;
        this.zze = str;
        this.zzf = map;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00c0 A[Catch: all -> 0x00ea, LOOP:1: B:26:0x00ba->B:28:0x00c0, LOOP_END, TryCatch #3 {all -> 0x00ea, blocks: (B:25:0x00b8, B:26:0x00ba, B:28:0x00c0, B:29:0x00c4), top: B:81:0x00b8 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x00ca A[Catch: all -> 0x00f4, IOException -> 0x00f8, TRY_ENTER, TRY_LEAVE, TryCatch #14 {IOException -> 0x00f8, all -> 0x00f4, blocks: (B:31:0x00ca, B:42:0x00f0, B:43:0x00f3), top: B:89:0x00a9 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:68:0x0138  */
    /* JADX WARN: Code duplicated, block: B:79:0x0177  */
    /* JADX WARN: Code duplicated, block: B:85:0x015b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x011c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x00c4 A[EDGE_INSN: B:97:0x00c4->B:29:0x00c4 BREAK  A[LOOP:1: B:26:0x00ba->B:28:0x00c0], SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x00f6: MOVE (r8 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:45:0x00f5 */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        HttpURLConnection httpURLConnection;
        OutputStream outputStreamTuitionPaymentFragmentbindingInflater1;
        IOException iOException;
        int i;
        Map map;
        Map map2;
        int i2;
        zzgx zzgxVar;
        zzhz zzhzVarZzaW;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        Map map3;
        InputStream inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] bArr;
        int i3;
        zzgz zzgzVar = this.zza;
        zzgzVar.zzaX();
        OutputStream outputStream = null;
        try {
            URL url = this.zzb;
            int i4 = com.google.android.gms.internal.measurement.zzcj.zzb;
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(uRLConnectionOpenConnection);
            if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                throw new IOException("Failed to obtain HTTP connection");
            }
            httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setDefaultUseCaches(false);
            zzic zzicVar = zzgzVar.zzu;
            zzicVar.zzc();
            httpURLConnection.setConnectTimeout(60000);
            zzicVar.zzc();
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setDoInput(true);
            try {
                Map map4 = this.zzf;
                if (map4 != null) {
                    for (Map.Entry entry : map4.entrySet()) {
                        httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                }
                byte[] bArr2 = this.zzc;
                if (bArr2 != null) {
                    byte[] bArrZzv = zzgzVar.zzg.zzp().zzv(bArr2);
                    zzgs zzgsVarZzk = zzicVar.zzaV().zzk();
                    int length = bArrZzv.length;
                    zzgsVarZzk.zzb("Uploading data. size", Integer.valueOf(length));
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
                    httpURLConnection.setFixedLengthStreamingMode(length);
                    httpURLConnection.connect();
                    outputStreamTuitionPaymentFragmentbindingInflater1 = ViewPortBuilder.TuitionPaymentFragmentbindingInflater1(httpURLConnection);
                    try {
                        outputStreamTuitionPaymentFragmentbindingInflater1.write(bArrZzv);
                        outputStreamTuitionPaymentFragmentbindingInflater1.close();
                        iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(httpURLConnection);
                        try {
                            try {
                                Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                                try {
                                    byteArrayOutputStream = new ByteArrayOutputStream();
                                    inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(httpURLConnection);
                                    try {
                                        bArr = new byte[1024];
                                        while (true) {
                                            i3 = inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault3.read(bArr);
                                            if (i3 > 0) {
                                                break;
                                            } else {
                                                byteArrayOutputStream.write(bArr, 0, i3);
                                            }
                                        }
                                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                                        if (inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
                                            inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault3.close();
                                        }
                                        if (httpURLConnection != null) {
                                            httpURLConnection.disconnect();
                                        }
                                        zzgz zzgzVar2 = this.zza;
                                        String str = this.zze;
                                        zzgw zzgwVar = this.zzd;
                                        zzhzVarZzaW = zzgzVar2.zzu.zzaW();
                                        zzgxVar = new zzgx(str, zzgwVar, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, null, byteArray, headerFields, null);
                                    } catch (Throwable th) {
                                        th = th;
                                        if (inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
                                            inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault3.close();
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
                                }
                            } catch (IOException e2) {
                                e = e2;
                                i = iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                map = null;
                                iOException = e;
                                if (outputStream != null) {
                                    try {
                                        outputStream.close();
                                    } catch (IOException e3) {
                                        this.zza.zzu.zzaV().zzb().zzc("Error closing HTTP compressed POST connection output stream. appId", zzgu.zzl(this.zze), e3);
                                    }
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                zzgz zzgzVar3 = this.zza;
                                String str2 = this.zze;
                                zzgw zzgwVar2 = this.zzd;
                                zzhzVarZzaW = zzgzVar3.zzu.zzaW();
                                zzgxVar = new zzgx(str2, zzgwVar2, i, iOException, null, map, null);
                            } catch (Throwable th3) {
                                th = th3;
                                i2 = iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                map2 = map3;
                                if (outputStream != null) {
                                    try {
                                        outputStream.close();
                                    } catch (IOException e4) {
                                        this.zza.zzu.zzaV().zzb().zzc("Error closing HTTP compressed POST connection output stream. appId", zzgu.zzl(this.zze), e4);
                                    }
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                this.zza.zzu.zzaW().zzj(new zzgx(this.zze, this.zzd, i2, null, null, map2, null));
                                throw th;
                            }
                        } catch (IOException e5) {
                            e = e5;
                            i = iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            map = null;
                            iOException = e;
                            if (outputStream != null) {
                                outputStream.close();
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            zzgz zzgzVar4 = this.zza;
                            String str3 = this.zze;
                            zzgw zzgwVar3 = this.zzd;
                            zzhzVarZzaW = zzgzVar4.zzu.zzaW();
                            zzgxVar = new zzgx(str3, zzgwVar3, i, iOException, null, map, null);
                        } catch (Throwable th4) {
                            th = th4;
                            i2 = iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            map2 = null;
                            if (outputStream != null) {
                                outputStream.close();
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            this.zza.zzu.zzaW().zzj(new zzgx(this.zze, this.zzd, i2, null, null, map2, null));
                            throw th;
                        }
                    } catch (IOException e6) {
                        iOException = e6;
                        i = 0;
                        map = null;
                        outputStream = outputStreamTuitionPaymentFragmentbindingInflater1;
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        zzgz zzgzVar5 = this.zza;
                        String str4 = this.zze;
                        zzgw zzgwVar4 = this.zzd;
                        zzhzVarZzaW = zzgzVar5.zzu.zzaW();
                        zzgxVar = new zzgx(str4, zzgwVar4, i, iOException, null, map, null);
                        zzhzVarZzaW.zzj(zzgxVar);
                    } catch (Throwable th5) {
                        th = th5;
                        map2 = null;
                        outputStream = outputStreamTuitionPaymentFragmentbindingInflater1;
                        i2 = 0;
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        this.zza.zzu.zzaW().zzj(new zzgx(this.zze, this.zzd, i2, null, null, map2, null));
                        throw th;
                    }
                } else {
                    iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(httpURLConnection);
                    Map<String, List<String>> headerFields2 = httpURLConnection.getHeaderFields();
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(httpURLConnection);
                    bArr = new byte[1024];
                    while (true) {
                        i3 = inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault3.read(bArr);
                        if (i3 > 0) {
                            break;
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, i3);
                    }
                    byte[] byteArray2 = byteArrayOutputStream.toByteArray();
                    if (inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
                        inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault3.close();
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    zzgz zzgzVar6 = this.zza;
                    String str5 = this.zze;
                    zzgw zzgwVar5 = this.zzd;
                    zzhzVarZzaW = zzgzVar6.zzu.zzaW();
                    zzgxVar = new zzgx(str5, zzgwVar5, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, null, byteArray2, headerFields2, null);
                }
            } catch (IOException e7) {
                iOException = e7;
                i = 0;
                map = null;
            } catch (Throwable th6) {
                th = th6;
                outputStreamTuitionPaymentFragmentbindingInflater1 = null;
            }
            zzhzVarZzaW.zzj(zzgxVar);
        } catch (IOException e8) {
            iOException = e8;
            i = 0;
            httpURLConnection = null;
            map = null;
        } catch (Throwable th7) {
            th = th7;
            httpURLConnection = null;
            outputStreamTuitionPaymentFragmentbindingInflater1 = null;
        }
    }
}
