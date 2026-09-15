package defpackage;

import android.graphics.Color;
import android.media.AudioTrack;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.compose.material3.CalendarModelKt;
import com.koushikdutta.async.AsyncServer;
import com.koushikdutta.async.http.Multimap;
import com.koushikdutta.async.http.cache.ResponseSource;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.lang.reflect.Field;
import java.net.CacheResponse;
import java.nio.ByteBuffer;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class SurfaceEdge extends unregisterOutputSurface {
    AsyncServer TuitionPaymentFragmentbindingInflater1;
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f215a;
    private boolean asBinder = true;
    private int asInterface;
    public SurfaceEdgeExternalSyntheticLambda5 b;
    private int d;

    public static class TuitionPaymentFragmentspecialinlinedviewModeldefault1 {
        FileInputStream[] TuitionPaymentFragmentbindingInflater1;
        createSurfaceRequest TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        long TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        asInterface TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    private SurfaceEdge() {
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0218  */
    /* JADX WARN: Code duplicated, block: B:103:0x0225  */
    /* JADX WARN: Code duplicated, block: B:105:0x0229  */
    /* JADX WARN: Code duplicated, block: B:106:0x022d  */
    /* JADX WARN: Code duplicated, block: B:108:0x0231  */
    /* JADX WARN: Code duplicated, block: B:111:0x0238  */
    /* JADX WARN: Code duplicated, block: B:114:0x023f  */
    /* JADX WARN: Code duplicated, block: B:71:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:74:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:75:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:78:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:81:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:84:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:86:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:88:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:91:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:97:0x020e  */
    /* JADX WARN: Code duplicated, block: B:99:0x0212  */
    @Override // defpackage.unregisterOutputSurface, defpackage.OpenGlRenderer
    public final lambdarelease5androidxcameracoreprocessingDefaultSurfaceProcessor TuitionPaymentFragmentspecialinlinedviewModeldefault3(final OpenGlRenderer.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2) {
        FileInputStream[] fileInputStreamArrB;
        ResponseSource responseSource;
        long jMin;
        long time;
        long millis;
        long millis2;
        String str;
        Date date;
        Date date2;
        long j;
        Packet packet = new Packet(tuitionPaymentFragmentspecialinlinedviewModeldefault2.f189a.INotificationSideChannel, createFragmentShader.TuitionPaymentFragmentspecialinlinedviewModeldefault1(tuitionPaymentFragmentspecialinlinedviewModeldefault2.f189a.g.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
        tuitionPaymentFragmentspecialinlinedviewModeldefault2.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault2.put("request-headers", packet);
        if (this.b == null || !this.asBinder || packet.asBinder) {
            this.asInterface++;
            return null;
        }
        try {
            fileInputStreamArrB = this.b.b(SurfaceEdgeExternalSyntheticLambda5.b(tuitionPaymentFragmentspecialinlinedviewModeldefault2.f189a.INotificationSideChannel));
            try {
                long jAvailable = fileInputStreamArrB[1].available();
                asBinder asbinder = new asBinder(fileInputStreamArrB[0]);
                Uri uri = tuitionPaymentFragmentspecialinlinedviewModeldefault2.f189a.INotificationSideChannel;
                String str2 = tuitionPaymentFragmentspecialinlinedviewModeldefault2.f189a.asBinder;
                Multimap multimap = tuitionPaymentFragmentspecialinlinedviewModeldefault2.f189a.g.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (asbinder.f216a.equals(uri.toString()) && asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1.equals(str2)) {
                    createSurfaceRequest createsurfacerequest = new createSurfaceRequest(uri, asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    Map<String, List<String>> mapTuitionPaymentFragmentbindingInflater1 = asbinder.asInterface.TuitionPaymentFragmentbindingInflater1();
                    for (String str3 : createsurfacerequest.getInterfaceDescriptor) {
                        List<String> list = mapTuitionPaymentFragmentbindingInflater1.get(str3);
                        List<String> list2 = multimap.get(str3);
                        if (list == list2 || (list != null && list.equals(list2))) {
                        }
                    }
                    asInterface asinterface = new asInterface(asbinder, fileInputStreamArrB[1]);
                    try {
                        Map<String, List<String>> headers = asinterface.getHeaders();
                        FileInputStream fileInputStream = asinterface.b;
                        if (headers == null || fileInputStream == null) {
                            this.asInterface++;
                            SurfaceEdgeExternalSyntheticLambda3.b(fileInputStreamArrB);
                            return null;
                        }
                        createFragmentShader createfragmentshaderTuitionPaymentFragmentspecialinlinedviewModeldefault1 = createFragmentShader.TuitionPaymentFragmentspecialinlinedviewModeldefault1(headers);
                        createSurfaceRequest createsurfacerequest2 = new createSurfaceRequest(tuitionPaymentFragmentspecialinlinedviewModeldefault2.f189a.INotificationSideChannel, createfragmentshaderTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                        String strValueOf = String.valueOf(jAvailable);
                        createfragmentshaderTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2("Content-Length");
                        createfragmentshaderTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1("Content-Length", strValueOf);
                        createfragmentshaderTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2("Content-Encoding");
                        createfragmentshaderTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2("Transfer-Encoding");
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        createsurfacerequest2.INotificationSideChannel = jCurrentTimeMillis;
                        createsurfacerequest2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1("X-Android-Sent-Millis", Long.toString(jCurrentTimeMillis));
                        createsurfacerequest2.onTransact = jCurrentTimeMillis2;
                        createsurfacerequest2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1("X-Android-Received-Millis", Long.toString(jCurrentTimeMillis2));
                        long jCurrentTimeMillis3 = System.currentTimeMillis();
                        if (!createsurfacerequest2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(packet) || packet.asBinder || packet.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != null || packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                            jAvailable = jAvailable;
                            asbinder = asbinder;
                            asinterface = asinterface;
                            createfragmentshaderTuitionPaymentFragmentspecialinlinedviewModeldefault1 = createfragmentshaderTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            responseSource = ResponseSource.NETWORK;
                        } else {
                            Date date3 = createsurfacerequest2.notify;
                            long jMax = date3 != null ? Math.max(0L, createsurfacerequest2.onTransact - date3.getTime()) : 0L;
                            if (createsurfacerequest2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != -1) {
                                jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(createsurfacerequest2.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
                            }
                            long j2 = createsurfacerequest2.onTransact;
                            long j3 = jMax + (j2 - createsurfacerequest2.INotificationSideChannel) + (jCurrentTimeMillis3 - j2);
                            if (createsurfacerequest2.d != -1) {
                                time = TimeUnit.SECONDS.toMillis(createsurfacerequest2.d);
                            } else {
                                if (createsurfacerequest2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                                    Date date4 = createsurfacerequest2.notify;
                                    time = createsurfacerequest2.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getTime() - (date4 != null ? date4.getTime() : createsurfacerequest2.onTransact);
                                    if (time > 0) {
                                    }
                                    if (packet.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != -1) {
                                        jMin = Math.min(jMin, TimeUnit.SECONDS.toMillis(packet.TuitionPaymentFragmentspecialinlinedviewModeldefault3));
                                    }
                                    if (packet.asInterface != -1) {
                                        millis = TimeUnit.SECONDS.toMillis(packet.asInterface);
                                    } else {
                                        millis = 0;
                                    }
                                    if (!createsurfacerequest2.f889a || packet.d == -1) {
                                        millis2 = 0;
                                    } else {
                                        millis2 = TimeUnit.SECONDS.toMillis(packet.d);
                                    }
                                    if (createsurfacerequest2.asBinder) {
                                        str = createsurfacerequest2.b;
                                        if (str != null) {
                                            date = createsurfacerequest2.g;
                                            if (date != null) {
                                                packet.TuitionPaymentFragmentbindingInflater1(date);
                                            } else {
                                                date2 = createsurfacerequest2.notify;
                                                if (date2 != null) {
                                                    packet.TuitionPaymentFragmentbindingInflater1(date2);
                                                }
                                            }
                                        } else {
                                            if (packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                                                packet.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2("If-None-Match");
                                            }
                                            packet.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1("If-None-Match", str);
                                            packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
                                        }
                                        if (packet.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                                            responseSource = ResponseSource.CONDITIONAL_CACHE;
                                        } else {
                                            responseSource = ResponseSource.CONDITIONAL_CACHE;
                                        }
                                    } else {
                                        j = millis + j3;
                                        if (j >= millis2 + jMin) {
                                            str = createsurfacerequest2.b;
                                            if (str != null) {
                                                date = createsurfacerequest2.g;
                                                if (date != null) {
                                                    packet.TuitionPaymentFragmentbindingInflater1(date);
                                                } else {
                                                    date2 = createsurfacerequest2.notify;
                                                    if (date2 != null) {
                                                        packet.TuitionPaymentFragmentbindingInflater1(date2);
                                                    }
                                                }
                                            } else {
                                                if (packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                                                    packet.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2("If-None-Match");
                                                }
                                                packet.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1("If-None-Match", str);
                                                packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
                                            }
                                            if (packet.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null || packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                                                responseSource = ResponseSource.CONDITIONAL_CACHE;
                                            } else {
                                                responseSource = ResponseSource.NETWORK;
                                            }
                                        } else {
                                            if (j >= jMin) {
                                                createsurfacerequest2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1("Warning", "110 HttpURLConnection \"Response is stale\"");
                                            }
                                            if (j3 > CalendarModelKt.MillisecondsIn24Hours && createsurfacerequest2.d == -1 && createsurfacerequest2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
                                                createsurfacerequest2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                                            }
                                            responseSource = ResponseSource.CACHE;
                                        }
                                    }
                                } else {
                                    if (createsurfacerequest2.g != null && createsurfacerequest2.cancelAll.getEncodedQuery() == null) {
                                        Date date5 = createsurfacerequest2.notify;
                                        long time2 = (date5 != null ? date5.getTime() : createsurfacerequest2.INotificationSideChannel) - createsurfacerequest2.g.getTime();
                                        if (time2 > 0) {
                                            jMin = time2 / 10;
                                        }
                                    }
                                    if (packet.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != -1) {
                                        jMin = Math.min(jMin, TimeUnit.SECONDS.toMillis(packet.TuitionPaymentFragmentspecialinlinedviewModeldefault3));
                                    }
                                    if (packet.asInterface != -1) {
                                        millis = TimeUnit.SECONDS.toMillis(packet.asInterface);
                                    } else {
                                        millis = 0;
                                    }
                                    if (createsurfacerequest2.f889a) {
                                        millis2 = 0;
                                    } else {
                                        millis2 = 0;
                                    }
                                    if (createsurfacerequest2.asBinder) {
                                        j = millis + j3;
                                        if (j >= millis2 + jMin) {
                                            if (j >= jMin) {
                                                createsurfacerequest2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1("Warning", "110 HttpURLConnection \"Response is stale\"");
                                            }
                                            if (j3 > CalendarModelKt.MillisecondsIn24Hours) {
                                                createsurfacerequest2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                                            }
                                            responseSource = ResponseSource.CACHE;
                                        } else {
                                            str = createsurfacerequest2.b;
                                            if (str != null) {
                                                date = createsurfacerequest2.g;
                                                if (date != null) {
                                                    packet.TuitionPaymentFragmentbindingInflater1(date);
                                                } else {
                                                    date2 = createsurfacerequest2.notify;
                                                    if (date2 != null) {
                                                        packet.TuitionPaymentFragmentbindingInflater1(date2);
                                                    }
                                                }
                                            } else {
                                                if (packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                                                    packet.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2("If-None-Match");
                                                }
                                                packet.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1("If-None-Match", str);
                                                packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
                                            }
                                            if (packet.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                                                responseSource = ResponseSource.CONDITIONAL_CACHE;
                                            } else {
                                                responseSource = ResponseSource.CONDITIONAL_CACHE;
                                            }
                                        }
                                    } else {
                                        str = createsurfacerequest2.b;
                                        if (str != null) {
                                            date = createsurfacerequest2.g;
                                            if (date != null) {
                                                packet.TuitionPaymentFragmentbindingInflater1(date);
                                            } else {
                                                date2 = createsurfacerequest2.notify;
                                                if (date2 != null) {
                                                    packet.TuitionPaymentFragmentbindingInflater1(date2);
                                                }
                                            }
                                        } else {
                                            if (packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                                                packet.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2("If-None-Match");
                                            }
                                            packet.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1("If-None-Match", str);
                                            packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
                                        }
                                        if (packet.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                                            responseSource = ResponseSource.CONDITIONAL_CACHE;
                                        } else {
                                            responseSource = ResponseSource.CONDITIONAL_CACHE;
                                        }
                                    }
                                }
                                jMin = 0;
                                if (packet.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != -1) {
                                    jMin = Math.min(jMin, TimeUnit.SECONDS.toMillis(packet.TuitionPaymentFragmentspecialinlinedviewModeldefault3));
                                }
                                if (packet.asInterface != -1) {
                                    millis = TimeUnit.SECONDS.toMillis(packet.asInterface);
                                } else {
                                    millis = 0;
                                }
                                if (createsurfacerequest2.f889a) {
                                    millis2 = 0;
                                } else {
                                    millis2 = 0;
                                }
                                if (createsurfacerequest2.asBinder) {
                                    j = millis + j3;
                                    if (j >= millis2 + jMin) {
                                        if (j >= jMin) {
                                            createsurfacerequest2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1("Warning", "110 HttpURLConnection \"Response is stale\"");
                                        }
                                        if (j3 > CalendarModelKt.MillisecondsIn24Hours) {
                                            createsurfacerequest2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                                        }
                                        responseSource = ResponseSource.CACHE;
                                    } else {
                                        str = createsurfacerequest2.b;
                                        if (str != null) {
                                            date = createsurfacerequest2.g;
                                            if (date != null) {
                                                packet.TuitionPaymentFragmentbindingInflater1(date);
                                            } else {
                                                date2 = createsurfacerequest2.notify;
                                                if (date2 != null) {
                                                    packet.TuitionPaymentFragmentbindingInflater1(date2);
                                                }
                                            }
                                        } else {
                                            if (packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                                                packet.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2("If-None-Match");
                                            }
                                            packet.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1("If-None-Match", str);
                                            packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
                                        }
                                        if (packet.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                                            responseSource = ResponseSource.CONDITIONAL_CACHE;
                                        } else {
                                            responseSource = ResponseSource.CONDITIONAL_CACHE;
                                        }
                                    }
                                } else {
                                    str = createsurfacerequest2.b;
                                    if (str != null) {
                                        date = createsurfacerequest2.g;
                                        if (date != null) {
                                            packet.TuitionPaymentFragmentbindingInflater1(date);
                                        } else {
                                            date2 = createsurfacerequest2.notify;
                                            if (date2 != null) {
                                                packet.TuitionPaymentFragmentbindingInflater1(date2);
                                            }
                                        }
                                    } else {
                                        if (packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                                            packet.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2("If-None-Match");
                                        }
                                        packet.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1("If-None-Match", str);
                                        packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
                                    }
                                    if (packet.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                                        responseSource = ResponseSource.CONDITIONAL_CACHE;
                                    } else {
                                        responseSource = ResponseSource.CONDITIONAL_CACHE;
                                    }
                                }
                            }
                            jMin = time;
                            if (packet.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != -1) {
                                jMin = Math.min(jMin, TimeUnit.SECONDS.toMillis(packet.TuitionPaymentFragmentspecialinlinedviewModeldefault3));
                            }
                            if (packet.asInterface != -1) {
                                millis = TimeUnit.SECONDS.toMillis(packet.asInterface);
                            } else {
                                millis = 0;
                            }
                            if (createsurfacerequest2.f889a) {
                                millis2 = 0;
                            } else {
                                millis2 = 0;
                            }
                            if (createsurfacerequest2.asBinder) {
                                j = millis + j3;
                                if (j >= millis2 + jMin) {
                                    if (j >= jMin) {
                                        createsurfacerequest2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1("Warning", "110 HttpURLConnection \"Response is stale\"");
                                    }
                                    if (j3 > CalendarModelKt.MillisecondsIn24Hours) {
                                        createsurfacerequest2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                                    }
                                    responseSource = ResponseSource.CACHE;
                                } else {
                                    str = createsurfacerequest2.b;
                                    if (str != null) {
                                        date = createsurfacerequest2.g;
                                        if (date != null) {
                                            packet.TuitionPaymentFragmentbindingInflater1(date);
                                        } else {
                                            date2 = createsurfacerequest2.notify;
                                            if (date2 != null) {
                                                packet.TuitionPaymentFragmentbindingInflater1(date2);
                                            }
                                        }
                                    } else {
                                        if (packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                                            packet.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2("If-None-Match");
                                        }
                                        packet.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1("If-None-Match", str);
                                        packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
                                    }
                                    if (packet.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                                        responseSource = ResponseSource.CONDITIONAL_CACHE;
                                    } else {
                                        responseSource = ResponseSource.CONDITIONAL_CACHE;
                                    }
                                }
                            } else {
                                str = createsurfacerequest2.b;
                                if (str != null) {
                                    date = createsurfacerequest2.g;
                                    if (date != null) {
                                        packet.TuitionPaymentFragmentbindingInflater1(date);
                                    } else {
                                        date2 = createsurfacerequest2.notify;
                                        if (date2 != null) {
                                            packet.TuitionPaymentFragmentbindingInflater1(date2);
                                        }
                                    }
                                } else {
                                    if (packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                                        packet.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2("If-None-Match");
                                    }
                                    packet.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1("If-None-Match", str);
                                    packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
                                }
                                if (packet.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                                    responseSource = ResponseSource.CONDITIONAL_CACHE;
                                } else {
                                    responseSource = ResponseSource.CONDITIONAL_CACHE;
                                }
                            }
                        }
                        if (responseSource == ResponseSource.CACHE) {
                            Node node = tuitionPaymentFragmentspecialinlinedviewModeldefault2.f189a;
                            if (node.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != null && node.TuitionPaymentFragmentspecialinlinedviewModeldefault2 <= 4) {
                                node.TuitionPaymentFragmentbindingInflater1("Response retrieved from cache");
                            }
                            final b tuitionPaymentFragmentbindingInflater1 = asbinder.f216a.startsWith("https://") ? new TuitionPaymentFragmentbindingInflater1(asinterface, jAvailable) : new b(asinterface, jAvailable);
                            AutoValue_Packet autoValue_Packet = ((TuitionPaymentFragmentspecialinlinedviewModeldefault2) tuitionPaymentFragmentbindingInflater1).TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            StringBuilder sb = new StringBuilder(256);
                            createFragmentShader createfragmentshader = createfragmentshaderTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            sb.append(createfragmentshader.b);
                            sb.append("\r\n");
                            for (int i = 0; i < createfragmentshader.TuitionPaymentFragmentspecialinlinedviewModeldefault2.size(); i += 2) {
                                sb.append(createfragmentshader.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(i));
                                sb.append(": ");
                                sb.append(createfragmentshader.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(i + 1));
                                sb.append("\r\n");
                            }
                            sb.append("\r\n");
                            autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault1(ByteBuffer.wrap(sb.toString().getBytes()));
                            this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1(new Runnable() { // from class: SurfaceEdge.4
                                @Override // java.lang.Runnable
                                public final void run() {
                                    tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1.b(null, tuitionPaymentFragmentbindingInflater1);
                                    tuitionPaymentFragmentbindingInflater1.d();
                                }
                            }, 0L);
                            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1++;
                            tuitionPaymentFragmentspecialinlinedviewModeldefault2.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault2.put("socket-owner", this);
                            DefaultSurfaceProcessorExternalSyntheticLambda13 defaultSurfaceProcessorExternalSyntheticLambda13 = new DefaultSurfaceProcessorExternalSyntheticLambda13();
                            defaultSurfaceProcessorExternalSyntheticLambda13.b();
                            return defaultSurfaceProcessorExternalSyntheticLambda13;
                        }
                        long j4 = jAvailable;
                        asInterface asinterface2 = asinterface;
                        if (responseSource == ResponseSource.CONDITIONAL_CACHE) {
                            Node node2 = tuitionPaymentFragmentspecialinlinedviewModeldefault2.f189a;
                            if (node2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != null && node2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 <= 4) {
                                node2.TuitionPaymentFragmentbindingInflater1("Response may be served from conditional cache");
                            }
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = new TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1 = fileInputStreamArrB;
                            tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = j4;
                            tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = createsurfacerequest2;
                            tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = asinterface2;
                            tuitionPaymentFragmentspecialinlinedviewModeldefault2.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault2.put("cache-data", tuitionPaymentFragmentspecialinlinedviewModeldefault1);
                            return null;
                        }
                        Node node3 = tuitionPaymentFragmentspecialinlinedviewModeldefault2.f189a;
                        if (node3.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != null && node3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 <= 3) {
                            node3.TuitionPaymentFragmentbindingInflater1("Response can not be served from cache");
                        }
                        this.asInterface++;
                        SurfaceEdgeExternalSyntheticLambda3.b(fileInputStreamArrB);
                        return null;
                    } catch (Exception unused) {
                        this.asInterface++;
                        SurfaceEdgeExternalSyntheticLambda3.b(fileInputStreamArrB);
                        return null;
                    }
                }
                this.asInterface++;
                SurfaceEdgeExternalSyntheticLambda3.b(fileInputStreamArrB);
                return null;
            } catch (IOException unused2) {
                this.asInterface++;
                SurfaceEdgeExternalSyntheticLambda3.b(fileInputStreamArrB);
                return null;
            }
        } catch (IOException unused3) {
            fileInputStreamArrB = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x010a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.unregisterOutputSurface, defpackage.OpenGlRenderer
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(OpenGlRenderer.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1) throws IllegalAccessException {
        String str;
        Date date;
        if (((b) lambdainitGlRenderer10androidxcameracoreprocessingDefaultSurfaceProcessor.TuitionPaymentFragmentbindingInflater1(tuitionPaymentFragmentbindingInflater1.asBinder, b.class)) != null) {
            tuitionPaymentFragmentbindingInflater1.d.b().b("X-Served-From", "cache");
            return;
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = (TuitionPaymentFragmentspecialinlinedviewModeldefault1) tuitionPaymentFragmentbindingInflater1.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get("cache-data");
        createFragmentShader createfragmentshaderTuitionPaymentFragmentspecialinlinedviewModeldefault1 = createFragmentShader.TuitionPaymentFragmentspecialinlinedviewModeldefault1(tuitionPaymentFragmentbindingInflater1.d.b().TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        createfragmentshaderTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2("Content-Length");
        createfragmentshaderTuitionPaymentFragmentspecialinlinedviewModeldefault1.b(String.format(Locale.ENGLISH, "%s %s %s", tuitionPaymentFragmentbindingInflater1.d.d(), Integer.valueOf(tuitionPaymentFragmentbindingInflater1.d.TuitionPaymentFragmentspecialinlinedviewModeldefault2()), tuitionPaymentFragmentbindingInflater1.d.asBinder()));
        createSurfaceRequest createsurfacerequest = new createSurfaceRequest(tuitionPaymentFragmentbindingInflater1.f189a.INotificationSideChannel, createfragmentshaderTuitionPaymentFragmentspecialinlinedviewModeldefault1);
        tuitionPaymentFragmentbindingInflater1.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault2.put("response-headers", createsurfacerequest);
        if (tuitionPaymentFragmentspecialinlinedviewModeldefault1 != null) {
            createSurfaceRequest createsurfacerequest2 = tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (createsurfacerequest.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == 304 || (createsurfacerequest2.g != null && (date = createsurfacerequest.g) != null && date.getTime() < createsurfacerequest2.g.getTime())) {
                Node node = tuitionPaymentFragmentbindingInflater1.f189a;
                if (node.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != null && node.TuitionPaymentFragmentspecialinlinedviewModeldefault2 <= 4) {
                    node.TuitionPaymentFragmentbindingInflater1("Serving response from conditional cache");
                }
                createSurfaceRequest createsurfacerequest3 = tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                createFragmentShader createfragmentshader = new createFragmentShader();
                for (int i = 0; i < createsurfacerequest3.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2.size() / 2; i++) {
                    String strTuitionPaymentFragmentspecialinlinedviewModeldefault1 = createsurfacerequest3.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i);
                    String strTuitionPaymentFragmentspecialinlinedviewModeldefault2 = createsurfacerequest3.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(i);
                    if (!strTuitionPaymentFragmentspecialinlinedviewModeldefault1.equals("Warning") || !strTuitionPaymentFragmentspecialinlinedviewModeldefault2.startsWith("1")) {
                        if (createSurfaceRequest.TuitionPaymentFragmentspecialinlinedviewModeldefault2(strTuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
                            createFragmentShader createfragmentshader2 = createsurfacerequest.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            int size = createfragmentshader2.TuitionPaymentFragmentspecialinlinedviewModeldefault2.size() - 2;
                            while (true) {
                                if (size < 0) {
                                    str = null;
                                    break;
                                } else {
                                    if (strTuitionPaymentFragmentspecialinlinedviewModeldefault1.equalsIgnoreCase(createfragmentshader2.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(size))) {
                                        str = createfragmentshader2.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(size + 1);
                                        break;
                                    }
                                    size -= 2;
                                }
                            }
                            if (str == null) {
                                createfragmentshader.TuitionPaymentFragmentspecialinlinedviewModeldefault1(strTuitionPaymentFragmentspecialinlinedviewModeldefault1, strTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                            }
                        } else {
                            createfragmentshader.TuitionPaymentFragmentspecialinlinedviewModeldefault1(strTuitionPaymentFragmentspecialinlinedviewModeldefault1, strTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                        }
                    }
                }
                for (int i2 = 0; i2 < createsurfacerequest.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2.size() / 2; i2++) {
                    String strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = createsurfacerequest.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i2);
                    if (createSurfaceRequest.TuitionPaymentFragmentspecialinlinedviewModeldefault2(strTuitionPaymentFragmentspecialinlinedviewModeldefault3)) {
                        createfragmentshader.TuitionPaymentFragmentspecialinlinedviewModeldefault1(strTuitionPaymentFragmentspecialinlinedviewModeldefault3, createsurfacerequest.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(i2));
                    }
                }
                createSurfaceRequest createsurfacerequest4 = new createSurfaceRequest(createsurfacerequest3.cancelAll, createfragmentshader);
                tuitionPaymentFragmentbindingInflater1.d.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new getOutSurfaceOrThrow(createsurfacerequest4.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1()));
                tuitionPaymentFragmentbindingInflater1.d.TuitionPaymentFragmentbindingInflater1(createsurfacerequest4.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                tuitionPaymentFragmentbindingInflater1.d.b(createsurfacerequest4.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1);
                tuitionPaymentFragmentbindingInflater1.d.b().b("X-Served-From", "conditional-cache");
                this.f215a++;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = new TuitionPaymentFragmentspecialinlinedviewModeldefault2(tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3, tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
                tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentbindingInflater1(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1, 0L);
                return;
            }
            tuitionPaymentFragmentbindingInflater1.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault2.remove("cache-data");
            SurfaceEdgeExternalSyntheticLambda3.b(tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1);
        }
        if (this.asBinder) {
            Packet packet = (Packet) tuitionPaymentFragmentbindingInflater1.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get("request-headers");
            if (packet == null || !createsurfacerequest.TuitionPaymentFragmentspecialinlinedviewModeldefault2(packet) || !tuitionPaymentFragmentbindingInflater1.f189a.asBinder.equals(ShareTarget.METHOD_GET)) {
                this.asInterface++;
                Node node2 = tuitionPaymentFragmentbindingInflater1.f189a;
                if (node2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null || node2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 > 3) {
                    return;
                }
                node2.TuitionPaymentFragmentbindingInflater1("Response is not cacheable");
                return;
            }
            String strB = SurfaceEdgeExternalSyntheticLambda5.b(tuitionPaymentFragmentbindingInflater1.f189a.INotificationSideChannel);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1096626159);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (46399 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (ViewConfiguration.getJumpTapTimeout() >> 16) + 40, 19 - View.resolveSizeAndState(0, 0, 0), 1513912262, false, "b", null);
            }
            int i3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-914723831);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 37836), Color.red(0) + 59, 18 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 769969118, false, "TuitionPaymentFragmentbindingInflater1", null);
            }
            int i4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
            long j = i4;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-639884696);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.indexOf("", "") + 37836), 59 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), View.MeasureSpec.getSize(0) + 18, 1027769791, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
            }
            int i5 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).getInt(null);
            long j2 = 69;
            long j3 = -1;
            long j4 = j3 ^ 4213190665942733488L;
            long j5 = j3 ^ 1306062831217052751L;
            long jIdentityHashCode = System.identityHashCode(this);
            long j6 = (((long) 70) * 4213190665942733488L) + (((long) (-68)) * 1306062831217052751L) + (((((j4 | j5) | jIdentityHashCode) ^ j3) | ((4213209534288273151L | jIdentityHashCode) ^ j3)) * j2) + (((long) (-69)) * (((j4 | 1306062831217052751L) ^ j3) | ((j4 | jIdentityHashCode) ^ j3) | ((jIdentityHashCode | 1306062831217052751L) ^ j3))) + (j2 * ((j5 | 4213190665942733488L) ^ j3));
            int i6 = i5;
            long j7 = j;
            int i7 = 0;
            while (true) {
                for (int i8 = 0; i8 != 8; i8++) {
                    i6 = (((((int) (j7 >> i8)) & 255) + (i6 << 6)) + (i6 << 16)) - i6;
                }
                if (i7 != 0) {
                    break;
                }
                i7++;
                j7 = j6;
            }
            if (i6 != i3) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551937752);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46400 - TextUtils.getOffsetAfter("", 0)), (ViewConfiguration.getScrollBarSize() >> 8) + 40, 19 - View.combineMeasuredStates(0, 0), -1205987569, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault2", null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null);
                throw new RuntimeException(String.valueOf(i4));
            }
            createFragmentShader createfragmentshader3 = packet.TuitionPaymentFragmentbindingInflater1;
            Set<String> set = createsurfacerequest.getInterfaceDescriptor;
            createFragmentShader createfragmentshader4 = new createFragmentShader();
            for (int i9 = 0; i9 < createfragmentshader3.TuitionPaymentFragmentspecialinlinedviewModeldefault2.size(); i9 += 2) {
                String str2 = createfragmentshader3.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(i9);
                if (set.contains(str2)) {
                    createfragmentshader4.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str2, createfragmentshader3.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(i9 + 1));
                }
            }
            asBinder asbinder = new asBinder(tuitionPaymentFragmentbindingInflater1.f189a.INotificationSideChannel, createfragmentshader4, tuitionPaymentFragmentbindingInflater1.f189a, createsurfacerequest.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = new TuitionPaymentFragmentspecialinlinedviewModeldefault3(0 == true ? 1 : 0);
            g gVar = new g(strB);
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2(0), SurfaceEdgeExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
                StringBuilder sb = new StringBuilder();
                sb.append(asbinder.f216a);
                sb.append('\n');
                bufferedWriter.write(sb.toString());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                sb2.append('\n');
                bufferedWriter.write(sb2.toString());
                StringBuilder sb3 = new StringBuilder();
                sb3.append(Integer.toString(asbinder.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault2.size() / 2));
                sb3.append('\n');
                bufferedWriter.write(sb3.toString());
                for (int i10 = 0; i10 < asbinder.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault2.size() / 2; i10++) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(asbinder.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i10));
                    sb4.append(": ");
                    sb4.append(asbinder.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault2(i10));
                    sb4.append('\n');
                    bufferedWriter.write(sb4.toString());
                }
                StringBuilder sb5 = new StringBuilder();
                sb5.append(asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b);
                sb5.append('\n');
                bufferedWriter.write(sb5.toString());
                StringBuilder sb6 = new StringBuilder();
                sb6.append(Integer.toString(asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2.size() / 2));
                sb6.append('\n');
                bufferedWriter.write(sb6.toString());
                for (int i11 = 0; i11 < asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2.size() / 2; i11++) {
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append(asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i11));
                    sb7.append(": ");
                    sb7.append(asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(i11));
                    sb7.append('\n');
                    bufferedWriter.write(sb7.toString());
                }
                if (asbinder.f216a.startsWith("https://")) {
                    bufferedWriter.write(10);
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append(asbinder.TuitionPaymentFragmentbindingInflater1);
                    sb8.append('\n');
                    bufferedWriter.write(sb8.toString());
                    asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(bufferedWriter, asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(bufferedWriter, asbinder.b);
                }
                bufferedWriter.close();
                gVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2(1);
                tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = gVar;
                tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
                tuitionPaymentFragmentbindingInflater1.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault2.put("body-cacher", tuitionPaymentFragmentspecialinlinedviewModeldefault3);
                Node node3 = tuitionPaymentFragmentbindingInflater1.f189a;
                if (node3.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != null && node3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 <= 3) {
                    node3.TuitionPaymentFragmentbindingInflater1("Caching response");
                }
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
            } catch (Exception unused) {
                gVar.b();
                this.asInterface++;
            }
        }
    }

    @Override // defpackage.unregisterOutputSurface, defpackage.OpenGlRenderer
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(OpenGlRenderer.asInterface asinterface) {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = (TuitionPaymentFragmentspecialinlinedviewModeldefault1) asinterface.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get("cache-data");
        if (tuitionPaymentFragmentspecialinlinedviewModeldefault1 != null && tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1 != null) {
            SurfaceEdgeExternalSyntheticLambda3.b(tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1);
        }
        b bVar = (b) lambdainitGlRenderer10androidxcameracoreprocessingDefaultSurfaceProcessor.TuitionPaymentFragmentbindingInflater1(asinterface.asBinder, b.class);
        if (bVar != null) {
            SurfaceEdgeExternalSyntheticLambda3.b(((TuitionPaymentFragmentspecialinlinedviewModeldefault2) bVar).TuitionPaymentFragmentspecialinlinedviewModeldefault2.b);
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = (TuitionPaymentFragmentspecialinlinedviewModeldefault3) asinterface.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get("body-cacher");
        if (tuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
            if (asinterface.onTransact != null) {
                g gVar = tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (gVar != null) {
                    gVar.b();
                    tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
                    return;
                }
                return;
            }
            g gVar2 = tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (gVar2 != null) {
                SurfaceEdgeExternalSyntheticLambda3.b(gVar2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                if (!gVar2.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    SurfaceEdge.this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(gVar2.TuitionPaymentFragmentspecialinlinedviewModeldefault1, gVar2.b);
                    SurfaceEdge.this.d++;
                    gVar2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
                }
                tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
            }
        }
    }

    static class TuitionPaymentFragmentspecialinlinedviewModeldefault3 extends lambdaexecuteSafely11 {
        g TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private AutoValue_Packet TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        private TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        }

        /* synthetic */ TuitionPaymentFragmentspecialinlinedviewModeldefault3(byte b) {
            this();
        }

        @Override // defpackage.getSurfaceEdge
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Exception exc) {
            g gVar;
            super.TuitionPaymentFragmentspecialinlinedviewModeldefault2(exc);
            if (exc == null || (gVar = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) == null) {
                return;
            }
            gVar.b();
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
        }

        @Override // defpackage.lambdaexecuteSafely11, defpackage.lambdasnapshot8androidxcameracoreprocessingDefaultSurfaceProcessor
        public final void TuitionPaymentFragmentbindingInflater1(checkReadyToRelease checkreadytorelease, AutoValue_Packet autoValue_Packet) {
            AutoValue_Packet autoValue_Packet2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (autoValue_Packet2 != null) {
                super.TuitionPaymentFragmentbindingInflater1(checkreadytorelease, autoValue_Packet2);
                if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 > 0) {
                    return;
                } else {
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
                }
            }
            AutoValue_Packet autoValue_Packet3 = new AutoValue_Packet();
            try {
                try {
                    g gVar = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    if (gVar != null) {
                        FileOutputStream fileOutputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault2 = gVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2(1);
                        if (fileOutputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                            while (autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2 != 0) {
                                ByteBuffer byteBufferRemove = autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.remove();
                                autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2 -= byteBufferRemove.remaining();
                                try {
                                    AutoValue_Packet.TuitionPaymentFragmentbindingInflater1(fileOutputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault2, byteBufferRemove);
                                    autoValue_Packet3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(byteBufferRemove);
                                } catch (Throwable th) {
                                    autoValue_Packet3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(byteBufferRemove);
                                    throw th;
                                }
                            }
                        } else {
                            g gVar2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            if (gVar2 != null) {
                                gVar2.b();
                                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
                            }
                        }
                    }
                } catch (Exception unused) {
                    g gVar3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    if (gVar3 != null) {
                        gVar3.b();
                        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
                    }
                }
                autoValue_Packet.TuitionPaymentFragmentbindingInflater1(autoValue_Packet3, autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                autoValue_Packet3.TuitionPaymentFragmentbindingInflater1(autoValue_Packet, autoValue_Packet3.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                super.TuitionPaymentFragmentbindingInflater1(checkreadytorelease, autoValue_Packet);
                if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null || autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2 <= 0) {
                    return;
                }
                AutoValue_Packet autoValue_Packet4 = new AutoValue_Packet();
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = autoValue_Packet4;
                autoValue_Packet.TuitionPaymentFragmentbindingInflater1(autoValue_Packet4, autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            } catch (Throwable th2) {
                autoValue_Packet.TuitionPaymentFragmentbindingInflater1(autoValue_Packet3, autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                autoValue_Packet3.TuitionPaymentFragmentbindingInflater1(autoValue_Packet, autoValue_Packet3.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                throw th2;
            }
        }

        @Override // defpackage.lambdaexecuteSafely11, defpackage.checkReadyToRelease
        public final void TuitionPaymentFragmentbindingInflater1() {
            g gVar = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (gVar != null) {
                gVar.b();
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
            }
            super.TuitionPaymentFragmentbindingInflater1();
        }
    }

    static class TuitionPaymentFragmentspecialinlinedviewModeldefault2 extends lambdaexecuteSafely11 {
        boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        asInterface TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private boolean g;
        AutoValue_Packet TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new AutoValue_Packet();
        private lambdaupdateTransformation3androidxcameracoreprocessingSurfaceEdge b = new lambdaupdateTransformation3androidxcameracoreprocessingSurfaceEdge();
        Runnable TuitionPaymentFragmentbindingInflater1 = new Runnable() { // from class: SurfaceEdge.TuitionPaymentFragmentspecialinlinedviewModeldefault2.1
            @Override // java.lang.Runnable
            public final void run() {
                TuitionPaymentFragmentspecialinlinedviewModeldefault2.this.d();
            }
        };

        public TuitionPaymentFragmentspecialinlinedviewModeldefault2(asInterface asinterface, long j) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = asinterface;
            this.b.TuitionPaymentFragmentbindingInflater1 = (int) j;
        }

        final void d() {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 > 0) {
                super.TuitionPaymentFragmentbindingInflater1(this, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 > 0) {
                    return;
                }
            }
            try {
                lambdaupdateTransformation3androidxcameracoreprocessingSurfaceEdge lambdaupdatetransformation3androidxcameracoreprocessingsurfaceedge = this.b;
                ByteBuffer byteBufferTuitionPaymentFragmentspecialinlinedviewModeldefault2 = AutoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2(Math.min(Math.max(lambdaupdatetransformation3androidxcameracoreprocessingsurfaceedge.TuitionPaymentFragmentbindingInflater1, lambdaupdatetransformation3androidxcameracoreprocessingsurfaceedge.TuitionPaymentFragmentspecialinlinedviewModeldefault3), lambdaupdatetransformation3androidxcameracoreprocessingsurfaceedge.b));
                int i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b.read(byteBufferTuitionPaymentFragmentspecialinlinedviewModeldefault2.array(), byteBufferTuitionPaymentFragmentspecialinlinedviewModeldefault2.arrayOffset(), byteBufferTuitionPaymentFragmentspecialinlinedviewModeldefault2.capacity());
                if (i == -1) {
                    AutoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault3(byteBufferTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2((Exception) null);
                    return;
                }
                this.b.TuitionPaymentFragmentbindingInflater1 = i * 2;
                byteBufferTuitionPaymentFragmentspecialinlinedviewModeldefault2.limit(i);
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(byteBufferTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                super.TuitionPaymentFragmentbindingInflater1(this, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 > 0) {
                    return;
                }
                TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1, 10L);
            } catch (IOException e2) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2(e2);
            }
        }

        @Override // defpackage.lambdaexecuteSafely11, defpackage.checkReadyToRelease
        public final void h_() {
            this.g = false;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1, 0L);
        }

        @Override // defpackage.lambdaexecuteSafely11, defpackage.checkReadyToRelease
        public final boolean f_() {
            return this.g;
        }

        @Override // defpackage.lambdaexecuteSafely11, defpackage.checkReadyToRelease
        public void TuitionPaymentFragmentbindingInflater1() {
            if (TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentbindingInflater1 == Thread.currentThread()) {
                AutoValue_Packet autoValue_Packet = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                while (autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.size() > 0) {
                    AutoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault3(autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.remove());
                }
                autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
                SurfaceEdgeExternalSyntheticLambda3.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b);
                super.TuitionPaymentFragmentbindingInflater1();
                return;
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentbindingInflater1(new Runnable() { // from class: SurfaceEdge.TuitionPaymentFragmentspecialinlinedviewModeldefault2.5
                @Override // java.lang.Runnable
                public final void run() {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2.this.TuitionPaymentFragmentbindingInflater1();
                }
            }, 0L);
        }

        @Override // defpackage.getSurfaceEdge
        public void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Exception exc) {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                SurfaceEdgeExternalSyntheticLambda3.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b);
                super.TuitionPaymentFragmentspecialinlinedviewModeldefault2(exc);
            }
        }
    }

    static final class asBinder {
        final String TuitionPaymentFragmentbindingInflater1;
        final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        final createFragmentShader TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        final Certificate[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f216a;
        final createFragmentShader asInterface;
        final Certificate[] b;

        public asBinder(InputStream inputStream) throws Throwable {
            addOnInvalidatedListener addoninvalidatedlistener = null;
            try {
                addOnInvalidatedListener addoninvalidatedlistener2 = new addOnInvalidatedListener(inputStream, SurfaceEdgeExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                try {
                    this.f216a = addoninvalidatedlistener2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = addoninvalidatedlistener2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                    this.asInterface = new createFragmentShader();
                    int iTuitionPaymentFragmentbindingInflater1 = addoninvalidatedlistener2.TuitionPaymentFragmentbindingInflater1();
                    for (int i = 0; i < iTuitionPaymentFragmentbindingInflater1; i++) {
                        this.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault1(addoninvalidatedlistener2.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
                    }
                    createFragmentShader createfragmentshader = new createFragmentShader();
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = createfragmentshader;
                    createfragmentshader.b(addoninvalidatedlistener2.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
                    int iTuitionPaymentFragmentbindingInflater2 = addoninvalidatedlistener2.TuitionPaymentFragmentbindingInflater1();
                    for (int i2 = 0; i2 < iTuitionPaymentFragmentbindingInflater2; i2++) {
                        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(addoninvalidatedlistener2.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
                    }
                    this.TuitionPaymentFragmentbindingInflater1 = null;
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
                    this.b = null;
                    SurfaceEdgeExternalSyntheticLambda3.b(addoninvalidatedlistener2, inputStream);
                } catch (Throwable th) {
                    th = th;
                    addoninvalidatedlistener = addoninvalidatedlistener2;
                    SurfaceEdgeExternalSyntheticLambda3.b(addoninvalidatedlistener, inputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }

        public asBinder(Uri uri, createFragmentShader createfragmentshader, Node node, createFragmentShader createfragmentshader2) {
            this.f216a = uri.toString();
            this.asInterface = createfragmentshader;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = node.asBinder;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = createfragmentshader2;
            this.TuitionPaymentFragmentbindingInflater1 = null;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
            this.b = null;
        }

        static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Writer writer, Certificate[] certificateArr) throws IOException {
            if (certificateArr == null) {
                writer.write("-1\n");
                return;
            }
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(Integer.toString(certificateArr.length));
                sb.append('\n');
                writer.write(sb.toString());
                for (Certificate certificate : certificateArr) {
                    String strEncodeToString = Base64.encodeToString(certificate.getEncoded(), 0);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(strEncodeToString);
                    sb2.append('\n');
                    writer.write(sb2.toString());
                }
            } catch (CertificateEncodingException e2) {
                throw new IOException(e2.getMessage());
            }
        }
    }

    static class asInterface extends CacheResponse {
        private final asBinder TuitionPaymentFragmentbindingInflater1;
        final FileInputStream b;

        public asInterface(asBinder asbinder, FileInputStream fileInputStream) {
            this.TuitionPaymentFragmentbindingInflater1 = asbinder;
            this.b = fileInputStream;
        }

        @Override // java.net.CacheResponse
        public final Map<String, List<String>> getHeaders() {
            return this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1();
        }

        @Override // java.net.CacheResponse
        public final /* synthetic */ InputStream getBody() throws IOException {
            return this.b;
        }
    }

    public class TuitionPaymentFragmentbindingInflater1 extends b implements UseCaseConfigUtil {
        public TuitionPaymentFragmentbindingInflater1(asInterface asinterface, long j) {
            super(asinterface, j);
        }

        public static /* synthetic */ void asInterface() {
            C0779immediateFuture.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0] = FutureChain1.TuitionPaymentFragmentbindingInflater1[0];
        }
    }

    class b extends TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements getAbsolutePathFromUri {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private lambdainitGlRenderer9androidxcameracoreprocessingDefaultSurfaceProcessor f217a;
        private boolean b;
        private boolean g;

        @Override // defpackage.executeSafely
        public final void TuitionPaymentFragmentbindingInflater1(lambdaonOutputSurface3androidxcameracoreprocessingDefaultSurfaceProcessor lambdaonoutputsurface3androidxcameracoreprocessingdefaultsurfaceprocessor) {
        }

        @Override // defpackage.executeSafely
        public final void b() {
        }

        public b(asInterface asinterface, long j) {
            super(asinterface, j);
            ((TuitionPaymentFragmentspecialinlinedviewModeldefault2) this).TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
        }

        @Override // SurfaceEdge.TuitionPaymentFragmentspecialinlinedviewModeldefault2, defpackage.getSurfaceEdge
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Exception exc) {
            super.TuitionPaymentFragmentspecialinlinedviewModeldefault2(exc);
            if (this.b) {
                return;
            }
            this.b = true;
            lambdainitGlRenderer9androidxcameracoreprocessingDefaultSurfaceProcessor lambdainitglrenderer9androidxcameracoreprocessingdefaultsurfaceprocessor = this.f217a;
            if (lambdainitglrenderer9androidxcameracoreprocessingdefaultsurfaceprocessor != null) {
                lambdainitglrenderer9androidxcameracoreprocessingdefaultsurfaceprocessor.b(exc);
            }
        }

        @Override // defpackage.executeSafely
        public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            return this.g;
        }

        @Override // SurfaceEdge.TuitionPaymentFragmentspecialinlinedviewModeldefault2, defpackage.lambdaexecuteSafely11, defpackage.checkReadyToRelease
        public final void TuitionPaymentFragmentbindingInflater1() {
            this.g = false;
        }

        @Override // defpackage.executeSafely
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(lambdainitGlRenderer9androidxcameracoreprocessingDefaultSurfaceProcessor lambdainitglrenderer9androidxcameracoreprocessingdefaultsurfaceprocessor) {
            this.f217a = lambdainitglrenderer9androidxcameracoreprocessingdefaultsurfaceprocessor;
        }

        @Override // defpackage.lambdaexecuteSafely11, defpackage.checkReadyToRelease
        public final AsyncServer TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            return SurfaceEdge.this.TuitionPaymentFragmentbindingInflater1;
        }

        @Override // defpackage.executeSafely
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(AutoValue_Packet autoValue_Packet) {
            while (autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.size() > 0) {
                AutoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault3(autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.remove());
            }
            autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        }
    }

    class g {
        String TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        FileOutputStream[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        File[] b;

        public g(String str) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
            SurfaceEdgeExternalSyntheticLambda5 surfaceEdgeExternalSyntheticLambda5 = SurfaceEdge.this.b;
            File[] fileArr = new File[2];
            for (int i = 0; i < 2; i++) {
                fileArr[i] = surfaceEdgeExternalSyntheticLambda5.TuitionPaymentFragmentbindingInflater1();
            }
            this.b = fileArr;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new FileOutputStream[2];
        }

        final FileOutputStream TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i) throws IOException {
            FileOutputStream[] fileOutputStreamArr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (fileOutputStreamArr[i] == null) {
                fileOutputStreamArr[i] = new FileOutputStream(this.b[i]);
            }
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i];
        }

        final void b() {
            SurfaceEdgeExternalSyntheticLambda3.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            SurfaceEdgeExternalSyntheticLambda5.TuitionPaymentFragmentbindingInflater1(this.b);
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                return;
            }
            SurfaceEdge.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
        }
    }

    public static SurfaceEdge TuitionPaymentFragmentspecialinlinedviewModeldefault1(InternalImageProcessor internalImageProcessor, File file) throws IOException {
        Iterator<OpenGlRenderer> it = internalImageProcessor.b.iterator();
        while (it.hasNext()) {
            if (it.next() instanceof SurfaceEdge) {
                throw new IOException("Response cache already added to http client");
            }
        }
        SurfaceEdge surfaceEdge = new SurfaceEdge();
        surfaceEdge.TuitionPaymentFragmentbindingInflater1 = internalImageProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        surfaceEdge.b = new SurfaceEdgeExternalSyntheticLambda5(file, 10485760L);
        internalImageProcessor.b.add(0, surfaceEdge);
        return surfaceEdge;
    }
}
