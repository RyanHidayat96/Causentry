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
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes6.dex */
final class zzln implements Runnable {
    final /* synthetic */ zzlo zza;
    private final URL zzb;
    private final byte[] zzc;
    private final zzll zzd;
    private final String zze;
    private final Map zzf;

    public zzln(zzlo zzloVar, String str, URL url, byte[] bArr, Map map, zzll zzllVar) {
        Objects.requireNonNull(zzloVar);
        this.zza = zzloVar;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(url);
        Preconditions.checkNotNull(zzllVar);
        this.zzb = url;
        this.zzc = bArr;
        this.zzd = zzllVar;
        this.zze = str;
        this.zzf = map;
    }

    private final void zzb(final int i, final Exception exc, final byte[] bArr, final Map map) {
        this.zza.zzu.zzaW().zzj(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzlm
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zza(i, exc, bArr, map);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:70:0x014b  */
    /* JADX WARN: Code duplicated, block: B:82:0x0174  */
    /* JADX WARN: Code duplicated, block: B:87:0x012f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x0158 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.google.android.gms.measurement.internal.zzln] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v3 */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        HttpURLConnection httpURLConnection;
        ?? r6;
        OutputStream outputStream;
        ?? r7;
        OutputStream outputStream2;
        InputStream inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        zzlo zzloVar = this.zza;
        zzloVar.zzaX();
        int i = 0;
        try {
            URL url = this.zzb;
            int i2 = com.google.android.gms.internal.measurement.zzcj.zzb;
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(uRLConnectionOpenConnection);
            if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                throw new IOException("Failed to obtain HTTP connection");
            }
            httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setDefaultUseCaches(false);
            zzic zzicVar = zzloVar.zzu;
            zzicVar.zzc();
            httpURLConnection.setConnectTimeout(60000);
            zzicVar.zzc();
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            ?? r5 = 1;
            httpURLConnection.setDoInput(true);
            try {
                try {
                    Map map = this.zzf;
                    if (map != null) {
                        for (Map.Entry entry : map.entrySet()) {
                            httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                        }
                    }
                    byte[] bArr = this.zzc;
                    if (bArr != null) {
                        try {
                            zzicVar.zzaU();
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                            gZIPOutputStream.write(bArr);
                            gZIPOutputStream.close();
                            byteArrayOutputStream.close();
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            zzgs zzgsVarZzk = this.zza.zzu.zzaV().zzk();
                            int length = byteArray.length;
                            zzgsVarZzk.zzb("Uploading data. size", Integer.valueOf(length));
                            httpURLConnection.setDoOutput(true);
                            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
                            httpURLConnection.setFixedLengthStreamingMode(length);
                            httpURLConnection.connect();
                            OutputStream outputStreamTuitionPaymentFragmentbindingInflater1 = ViewPortBuilder.TuitionPaymentFragmentbindingInflater1(httpURLConnection);
                            try {
                                outputStreamTuitionPaymentFragmentbindingInflater1.write(byteArray);
                                outputStreamTuitionPaymentFragmentbindingInflater1.close();
                                r5 = outputStreamTuitionPaymentFragmentbindingInflater1;
                            } catch (IOException e2) {
                                e = e2;
                                r7 = 0;
                                outputStream2 = outputStreamTuitionPaymentFragmentbindingInflater1;
                                if (outputStream2 != null) {
                                    try {
                                        outputStream2.close();
                                    } catch (IOException e3) {
                                        this.zza.zzu.zzaV().zzb().zzc("Error closing HTTP compressed POST connection output stream. appId", zzgu.zzl(this.zze), e3);
                                    }
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                zzb(i, e, null, r7);
                            } catch (Throwable th) {
                                th = th;
                                r6 = 0;
                                outputStream = outputStreamTuitionPaymentFragmentbindingInflater1;
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
                                zzb(i, null, null, r6);
                                throw th;
                            }
                        } catch (IOException e5) {
                            this.zza.zzu.zzaV().zzb().zzb("Failed to gzip post request content", e5);
                            throw e5;
                        }
                    }
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(httpURLConnection);
                    try {
                        try {
                            Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                            try {
                                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(httpURLConnection);
                                try {
                                    byte[] bArr2 = new byte[1024];
                                    while (true) {
                                        int i3 = inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault3.read(bArr2);
                                        if (i3 <= 0) {
                                            break;
                                        } else {
                                            byteArrayOutputStream2.write(bArr2, 0, i3);
                                        }
                                    }
                                    byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                                    if (inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
                                        inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault3.close();
                                    }
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                    zzb(iTuitionPaymentFragmentspecialinlinedviewModeldefault2, null, byteArray2, headerFields);
                                } catch (Throwable th2) {
                                    th = th2;
                                    if (inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
                                        inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault3.close();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
                            }
                        } catch (IOException e6) {
                            i = iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            e = e6;
                            outputStream2 = null;
                            r7 = 0;
                            if (outputStream2 != null) {
                                outputStream2.close();
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            zzb(i, e, null, r7);
                        } catch (Throwable th4) {
                            i = iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            th = th4;
                            outputStream = null;
                            r6 = 0;
                            if (outputStream != null) {
                                outputStream.close();
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            zzb(i, null, null, r6);
                            throw th;
                        }
                    } catch (IOException e7) {
                        r7 = r5;
                        outputStream2 = null;
                        i = iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        e = e7;
                        if (outputStream2 != null) {
                            outputStream2.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        zzb(i, e, null, r7);
                    } catch (Throwable th5) {
                        r6 = r5;
                        outputStream = null;
                        i = iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        th = th5;
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        zzb(i, null, null, r6);
                        throw th;
                    }
                } catch (IOException e8) {
                    e = e8;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (IOException e9) {
            e = e9;
            httpURLConnection = null;
        } catch (Throwable th7) {
            th = th7;
            httpURLConnection = null;
        }
    }

    final /* synthetic */ void zza(int i, Exception exc, byte[] bArr, Map map) {
        this.zzd.zza(this.zze, i, exc, bArr, map);
    }
}
