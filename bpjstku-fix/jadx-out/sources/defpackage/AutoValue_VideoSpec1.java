package defpackage;

import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonEncodingException;
import com.squareup.moshi.JsonReader;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigDecimal;
import kotlin.text.Charsets;
import okio.ByteString;

/* JADX INFO: loaded from: classes5.dex */
public final class AutoValue_VideoSpec1 extends JsonReader {
    private int INotificationSideChannel;
    private String INotificationSideChannelStub;
    private final RotationProvider1 RemoteActionCompatParcelizer;
    private final RotationProviderListenerWrapper cancel;
    private int notify = 0;
    private long onTransact;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ByteString f88a = ByteString.TuitionPaymentFragmentspecialinlinedviewModeldefault1("'\\");
    private static final ByteString asInterface = ByteString.TuitionPaymentFragmentspecialinlinedviewModeldefault1("\"\\");
    private static final ByteString cancelAll = ByteString.TuitionPaymentFragmentspecialinlinedviewModeldefault1("{}[]:, \n\t\r\f/\\;#=");
    private static final ByteString asBinder = ByteString.TuitionPaymentFragmentspecialinlinedviewModeldefault1("\n\r");
    private static final ByteString d = ByteString.TuitionPaymentFragmentspecialinlinedviewModeldefault1("*/");

    public AutoValue_VideoSpec1(RotationProvider1 rotationProvider1) {
        if (rotationProvider1 == null) {
            throw new NullPointerException("source == null");
        }
        this.RemoteActionCompatParcelizer = rotationProvider1;
        this.cancel = rotationProvider1.asInterface();
        TuitionPaymentFragmentbindingInflater1(6);
    }

    @Override // com.squareup.moshi.JsonReader
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() throws IOException {
        int iINotificationSideChannelStubProxy = this.notify;
        if (iINotificationSideChannelStubProxy == 0) {
            iINotificationSideChannelStubProxy = INotificationSideChannelStubProxy();
        }
        if (iINotificationSideChannelStubProxy == 3) {
            TuitionPaymentFragmentbindingInflater1(1);
            this.TuitionPaymentFragmentbindingInflater1[this.g - 1] = 0;
            this.notify = 0;
        } else {
            StringBuilder sb = new StringBuilder("Expected BEGIN_ARRAY but was ");
            sb.append(cancelAll());
            sb.append(" at path ");
            sb.append(TuitionPaymentFragmentspecialinlinedviewModeldefault2());
            throw new JsonDataException(sb.toString());
        }
    }

    @Override // com.squareup.moshi.JsonReader
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() throws IOException {
        int iINotificationSideChannelStubProxy = this.notify;
        if (iINotificationSideChannelStubProxy == 0) {
            iINotificationSideChannelStubProxy = INotificationSideChannelStubProxy();
        }
        if (iINotificationSideChannelStubProxy == 4) {
            this.g--;
            int[] iArr = this.TuitionPaymentFragmentbindingInflater1;
            int i = this.g - 1;
            iArr[i] = iArr[i] + 1;
            this.notify = 0;
            return;
        }
        StringBuilder sb = new StringBuilder("Expected END_ARRAY but was ");
        sb.append(cancelAll());
        sb.append(" at path ");
        sb.append(TuitionPaymentFragmentspecialinlinedviewModeldefault2());
        throw new JsonDataException(sb.toString());
    }

    @Override // com.squareup.moshi.JsonReader
    public final void b() throws IOException {
        int iINotificationSideChannelStubProxy = this.notify;
        if (iINotificationSideChannelStubProxy == 0) {
            iINotificationSideChannelStubProxy = INotificationSideChannelStubProxy();
        }
        if (iINotificationSideChannelStubProxy == 1) {
            TuitionPaymentFragmentbindingInflater1(3);
            this.notify = 0;
        } else {
            StringBuilder sb = new StringBuilder("Expected BEGIN_OBJECT but was ");
            sb.append(cancelAll());
            sb.append(" at path ");
            sb.append(TuitionPaymentFragmentspecialinlinedviewModeldefault2());
            throw new JsonDataException(sb.toString());
        }
    }

    @Override // com.squareup.moshi.JsonReader
    public final void TuitionPaymentFragmentbindingInflater1() throws IOException {
        int iINotificationSideChannelStubProxy = this.notify;
        if (iINotificationSideChannelStubProxy == 0) {
            iINotificationSideChannelStubProxy = INotificationSideChannelStubProxy();
        }
        if (iINotificationSideChannelStubProxy == 2) {
            this.g--;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2[this.g] = null;
            int[] iArr = this.TuitionPaymentFragmentbindingInflater1;
            int i = this.g - 1;
            iArr[i] = iArr[i] + 1;
            this.notify = 0;
            return;
        }
        StringBuilder sb = new StringBuilder("Expected END_OBJECT but was ");
        sb.append(cancelAll());
        sb.append(" at path ");
        sb.append(TuitionPaymentFragmentspecialinlinedviewModeldefault2());
        throw new JsonDataException(sb.toString());
    }

    @Override // com.squareup.moshi.JsonReader
    public final boolean a() throws IOException {
        int iINotificationSideChannelStubProxy = this.notify;
        if (iINotificationSideChannelStubProxy == 0) {
            iINotificationSideChannelStubProxy = INotificationSideChannelStubProxy();
        }
        return (iINotificationSideChannelStubProxy == 2 || iINotificationSideChannelStubProxy == 4 || iINotificationSideChannelStubProxy == 18) ? false : true;
    }

    @Override // com.squareup.moshi.JsonReader
    public final JsonReader.Token cancelAll() throws IOException {
        int iINotificationSideChannelStubProxy = this.notify;
        if (iINotificationSideChannelStubProxy == 0) {
            iINotificationSideChannelStubProxy = INotificationSideChannelStubProxy();
        }
        switch (iINotificationSideChannelStubProxy) {
            case 1:
                return JsonReader.Token.BEGIN_OBJECT;
            case 2:
                return JsonReader.Token.END_OBJECT;
            case 3:
                return JsonReader.Token.BEGIN_ARRAY;
            case 4:
                return JsonReader.Token.END_ARRAY;
            case 5:
            case 6:
                return JsonReader.Token.BOOLEAN;
            case 7:
                return JsonReader.Token.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return JsonReader.Token.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return JsonReader.Token.NAME;
            case 16:
            case 17:
                return JsonReader.Token.NUMBER;
            case 18:
                return JsonReader.Token.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x015e  */
    /* JADX WARN: Code duplicated, block: B:103:0x016e  */
    /* JADX WARN: Code duplicated, block: B:105:0x0179  */
    /* JADX WARN: Code duplicated, block: B:107:0x017d  */
    /* JADX WARN: Code duplicated, block: B:151:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:153:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:156:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:162:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:163:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:173:0x021f A[DONT_INVERT, PHI: r3
  0x021f: PHI (r3v3 char) = (r3v2 char), (r3v6 char) binds: [B:161:0x01f8, B:172:0x021e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:174:0x0221  */
    /* JADX WARN: Code duplicated, block: B:182:0x0234 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:183:0x0235  */
    /* JADX WARN: Code duplicated, block: B:185:0x0243  */
    /* JADX WARN: Code duplicated, block: B:187:0x0247  */
    /* JADX WARN: Code duplicated, block: B:189:0x024c  */
    /* JADX WARN: Code duplicated, block: B:191:0x0251  */
    /* JADX WARN: Code duplicated, block: B:193:0x0258  */
    /* JADX WARN: Code duplicated, block: B:195:0x0260 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:196:0x0262  */
    /* JADX WARN: Code duplicated, block: B:198:0x026b  */
    /* JADX WARN: Code duplicated, block: B:208:0x0285  */
    /* JADX WARN: Code duplicated, block: B:210:0x0289  */
    /* JADX WARN: Code duplicated, block: B:212:0x028e  */
    /* JADX WARN: Code duplicated, block: B:214:0x0292  */
    /* JADX WARN: Code duplicated, block: B:216:0x029c  */
    /* JADX WARN: Code duplicated, block: B:218:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:270:0x0228 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:271:0x01f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:283:0x013a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:284:0x011d A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:80:0x0105  */
    /* JADX WARN: Code duplicated, block: B:83:0x0112  */
    /* JADX WARN: Code duplicated, block: B:86:0x011f  */
    /* JADX WARN: Code duplicated, block: B:94:0x0145  */
    /* JADX WARN: Code duplicated, block: B:99:0x015d A[RETURN] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private int INotificationSideChannelStubProxy() throws IOException {
        int i;
        int iTuitionPaymentFragmentbindingInflater1;
        byte bTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        String str;
        String str2;
        int i2;
        int length;
        int i3;
        int i4;
        byte bTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        boolean z;
        char c;
        int i5;
        int i6;
        char c2;
        int i7;
        byte bTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        char c3;
        int i8 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1[this.g - 1];
        if (i8 == 1) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1[this.g - 1] = 2;
        } else if (i8 == 2) {
            int iTuitionPaymentFragmentbindingInflater2 = TuitionPaymentFragmentbindingInflater1(true);
            this.cancel.cancel();
            if (iTuitionPaymentFragmentbindingInflater2 != 44) {
                if (iTuitionPaymentFragmentbindingInflater2 != 59) {
                    if (iTuitionPaymentFragmentbindingInflater2 == 93) {
                        this.notify = 4;
                        return 4;
                    }
                    throw TuitionPaymentFragmentspecialinlinedviewModeldefault2("Unterminated array");
                }
                if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                    throw TuitionPaymentFragmentspecialinlinedviewModeldefault2("Use JsonReader.setLenient(true) to accept malformed JSON");
                }
            }
        } else {
            if (i8 == 3 || i8 == 5) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1[this.g - 1] = 4;
                if (i8 == 5) {
                    int iTuitionPaymentFragmentbindingInflater3 = TuitionPaymentFragmentbindingInflater1(true);
                    this.cancel.cancel();
                    if (iTuitionPaymentFragmentbindingInflater3 != 44) {
                        if (iTuitionPaymentFragmentbindingInflater3 != 59) {
                            if (iTuitionPaymentFragmentbindingInflater3 == 125) {
                                this.notify = 2;
                                return 2;
                            }
                            throw TuitionPaymentFragmentspecialinlinedviewModeldefault2("Unterminated object");
                        }
                        if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                            throw TuitionPaymentFragmentspecialinlinedviewModeldefault2("Use JsonReader.setLenient(true) to accept malformed JSON");
                        }
                    }
                }
                int iTuitionPaymentFragmentbindingInflater4 = TuitionPaymentFragmentbindingInflater1(true);
                if (iTuitionPaymentFragmentbindingInflater4 == 34) {
                    this.cancel.cancel();
                    this.notify = 13;
                    return 13;
                }
                if (iTuitionPaymentFragmentbindingInflater4 == 39) {
                    this.cancel.cancel();
                    if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                        this.notify = 12;
                        return 12;
                    }
                    throw TuitionPaymentFragmentspecialinlinedviewModeldefault2("Use JsonReader.setLenient(true) to accept malformed JSON");
                }
                if (iTuitionPaymentFragmentbindingInflater4 == 125) {
                    if (i8 != 5) {
                        this.cancel.cancel();
                        this.notify = 2;
                        return 2;
                    }
                    throw TuitionPaymentFragmentspecialinlinedviewModeldefault2("Expected name");
                }
                if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                    if (TuitionPaymentFragmentspecialinlinedviewModeldefault3((char) iTuitionPaymentFragmentbindingInflater4)) {
                        this.notify = 14;
                        return 14;
                    }
                    throw TuitionPaymentFragmentspecialinlinedviewModeldefault2("Expected name");
                }
                throw TuitionPaymentFragmentspecialinlinedviewModeldefault2("Use JsonReader.setLenient(true) to accept malformed JSON");
            }
            if (i8 == 4) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1[this.g - 1] = 5;
                int iTuitionPaymentFragmentbindingInflater5 = TuitionPaymentFragmentbindingInflater1(true);
                this.cancel.cancel();
                if (iTuitionPaymentFragmentbindingInflater5 != 58) {
                    if (iTuitionPaymentFragmentbindingInflater5 != 61) {
                        throw TuitionPaymentFragmentspecialinlinedviewModeldefault2("Expected ':'");
                    }
                    if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                        if (this.RemoteActionCompatParcelizer.asBinder(1L) && this.cancel.TuitionPaymentFragmentspecialinlinedviewModeldefault3(0L) == 62) {
                            this.cancel.cancel();
                        }
                    } else {
                        throw TuitionPaymentFragmentspecialinlinedviewModeldefault2("Use JsonReader.setLenient(true) to accept malformed JSON");
                    }
                }
            } else {
                if (i8 == 6) {
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault1[this.g - 1] = 7;
                } else if (i8 == 7) {
                    i = 0;
                    if (TuitionPaymentFragmentbindingInflater1(false) == -1) {
                        this.notify = 18;
                        return 18;
                    }
                    if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                        throw TuitionPaymentFragmentspecialinlinedviewModeldefault2("Use JsonReader.setLenient(true) to accept malformed JSON");
                    }
                } else {
                    i = 0;
                    if (i8 == 8) {
                        throw new IllegalStateException("JsonReader is closed");
                    }
                }
                iTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(true);
                if (iTuitionPaymentFragmentbindingInflater1 != 34) {
                    this.cancel.cancel();
                    this.notify = 9;
                    return 9;
                }
                if (iTuitionPaymentFragmentbindingInflater1 == 39) {
                    if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                        this.cancel.cancel();
                        this.notify = 8;
                        return 8;
                    }
                    throw TuitionPaymentFragmentspecialinlinedviewModeldefault2("Use JsonReader.setLenient(true) to accept malformed JSON");
                }
                if (iTuitionPaymentFragmentbindingInflater1 != 44 && iTuitionPaymentFragmentbindingInflater1 != 59) {
                    if (iTuitionPaymentFragmentbindingInflater1 != 91) {
                        this.cancel.cancel();
                        this.notify = 3;
                        return 3;
                    }
                    if (iTuitionPaymentFragmentbindingInflater1 != 93) {
                        if (iTuitionPaymentFragmentbindingInflater1 != 123) {
                            this.cancel.cancel();
                            this.notify = 1;
                            return 1;
                        }
                        bTuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.cancel.TuitionPaymentFragmentspecialinlinedviewModeldefault3(0L);
                        if (bTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 116 || bTuitionPaymentFragmentspecialinlinedviewModeldefault3 == 84) {
                            str = "true";
                            str2 = "TRUE";
                            i2 = 5;
                        } else {
                            if (bTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 102 && bTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 70) {
                                if (bTuitionPaymentFragmentspecialinlinedviewModeldefault3 == 110 || bTuitionPaymentFragmentspecialinlinedviewModeldefault3 == 78) {
                                    str = "null";
                                    str2 = "NULL";
                                    i2 = 7;
                                } else {
                                    i2 = i;
                                }
                                if (i2 != 0) {
                                    return i2;
                                }
                                z = true;
                                long j = 0;
                                c = 0;
                                i5 = 0;
                                boolean z2 = false;
                                while (true) {
                                    i6 = i5 + 1;
                                    if (this.RemoteActionCompatParcelizer.asBinder(i6)) {
                                        bTuitionPaymentFragmentspecialinlinedviewModeldefault5 = this.cancel.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5);
                                        if (bTuitionPaymentFragmentspecialinlinedviewModeldefault5 != 43) {
                                            if (bTuitionPaymentFragmentspecialinlinedviewModeldefault5 != 69 || bTuitionPaymentFragmentspecialinlinedviewModeldefault5 == 101) {
                                                if (c != 2 || c == 4) {
                                                    c = 5;
                                                    i5 = i6;
                                                } else {
                                                    i7 = 0;
                                                }
                                            } else if (bTuitionPaymentFragmentspecialinlinedviewModeldefault5 == 45) {
                                                c3 = 6;
                                                if (c == 0) {
                                                    c = 1;
                                                    z2 = true;
                                                } else {
                                                    if (c != 5) {
                                                        i7 = 0;
                                                    }
                                                    c = c3;
                                                }
                                                i5 = i6;
                                            } else if (bTuitionPaymentFragmentspecialinlinedviewModeldefault5 != 46) {
                                                if (bTuitionPaymentFragmentspecialinlinedviewModeldefault5 >= 48 && bTuitionPaymentFragmentspecialinlinedviewModeldefault5 <= 57) {
                                                    if (c == 1 || c == 0) {
                                                        j = -(bTuitionPaymentFragmentspecialinlinedviewModeldefault5 - 48);
                                                        c = 2;
                                                    } else if (c == 2) {
                                                        if (j != 0) {
                                                            long j2 = (10 * j) - ((long) (bTuitionPaymentFragmentspecialinlinedviewModeldefault5 - 48));
                                                            z &= j > -922337203685477580L || (j == -922337203685477580L && j2 < j);
                                                            j = j2;
                                                        }
                                                    } else if (c == 3) {
                                                        c = 4;
                                                    } else if (c == 5 || c == 6) {
                                                        c = 7;
                                                    }
                                                    i5 = i6;
                                                } else if (!TuitionPaymentFragmentspecialinlinedviewModeldefault3(bTuitionPaymentFragmentspecialinlinedviewModeldefault5)) {
                                                }
                                                i7 = 0;
                                            } else if (c == 2) {
                                                c = 3;
                                                i5 = i6;
                                            } else {
                                                i7 = 0;
                                            }
                                            if (i7 != 0) {
                                                return i7;
                                            }
                                            if (!TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.cancel.TuitionPaymentFragmentspecialinlinedviewModeldefault3(0L))) {
                                                throw TuitionPaymentFragmentspecialinlinedviewModeldefault2("Expected value");
                                            }
                                            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                                                this.notify = 10;
                                                return 10;
                                            }
                                            throw TuitionPaymentFragmentspecialinlinedviewModeldefault2("Use JsonReader.setLenient(true) to accept malformed JSON");
                                        }
                                        c3 = 6;
                                        if (c != 5) {
                                            i7 = 0;
                                            if (i7 != 0) {
                                                return i7;
                                            }
                                            if (!TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.cancel.TuitionPaymentFragmentspecialinlinedviewModeldefault3(0L))) {
                                                throw TuitionPaymentFragmentspecialinlinedviewModeldefault2("Expected value");
                                            }
                                            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                                                this.notify = 10;
                                                return 10;
                                            }
                                            throw TuitionPaymentFragmentspecialinlinedviewModeldefault2("Use JsonReader.setLenient(true) to accept malformed JSON");
                                        }
                                        c = c3;
                                        i5 = i6;
                                    }
                                    c2 = 2;
                                    if (c != 2) {
                                        if (c != c2 || c == 4 || c == 7) {
                                            this.INotificationSideChannel = i5;
                                            this.notify = 17;
                                            i7 = 17;
                                        } else {
                                            i7 = 0;
                                        }
                                    } else if (!z && ((j != Long.MIN_VALUE || z2) && (j != 0 || !z2))) {
                                        if (!z2) {
                                            j = -j;
                                        }
                                        this.onTransact = j;
                                        this.cancel.g(i5);
                                        this.notify = 16;
                                        i7 = 16;
                                    } else {
                                        c2 = 2;
                                        if (c != c2) {
                                        }
                                        this.INotificationSideChannel = i5;
                                        this.notify = 17;
                                        i7 = 17;
                                    }
                                    if (i7 != 0) {
                                        return i7;
                                    }
                                    if (!TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.cancel.TuitionPaymentFragmentspecialinlinedviewModeldefault3(0L))) {
                                        throw TuitionPaymentFragmentspecialinlinedviewModeldefault2("Expected value");
                                    }
                                    if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                                        this.notify = 10;
                                        return 10;
                                    }
                                    throw TuitionPaymentFragmentspecialinlinedviewModeldefault2("Use JsonReader.setLenient(true) to accept malformed JSON");
                                }
                            }
                            str = "false";
                            str2 = "FALSE";
                            i2 = 6;
                        }
                        length = str.length();
                        i3 = 1;
                        while (true) {
                            if (i3 < length) {
                                i4 = i3 + 1;
                                if (!this.RemoteActionCompatParcelizer.asBinder(i4) && ((bTuitionPaymentFragmentspecialinlinedviewModeldefault4 = this.cancel.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i3)) == str.charAt(i3) || bTuitionPaymentFragmentspecialinlinedviewModeldefault4 == str2.charAt(i3))) {
                                    i3 = i4;
                                }
                            } else if (this.RemoteActionCompatParcelizer.asBinder(length + 1) || !TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.cancel.TuitionPaymentFragmentspecialinlinedviewModeldefault3(length))) {
                                this.cancel.g(length);
                                this.notify = i2;
                                break;
                            }
                            i2 = 0;
                            break;
                        }
                        if (i2 != 0) {
                            return i2;
                        }
                        z = true;
                        long j3 = 0;
                        c = 0;
                        i5 = 0;
                        boolean z3 = false;
                        while (true) {
                            i6 = i5 + 1;
                            if (this.RemoteActionCompatParcelizer.asBinder(i6)) {
                                bTuitionPaymentFragmentspecialinlinedviewModeldefault5 = this.cancel.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5);
                                if (bTuitionPaymentFragmentspecialinlinedviewModeldefault5 != 43) {
                                    if (bTuitionPaymentFragmentspecialinlinedviewModeldefault5 != 69) {
                                        if (c != 2) {
                                        }
                                        c = 5;
                                        i5 = i6;
                                    } else {
                                        if (c != 2) {
                                        }
                                        c = 5;
                                        i5 = i6;
                                    }
                                    if (i7 != 0) {
                                        return i7;
                                    }
                                    if (!TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.cancel.TuitionPaymentFragmentspecialinlinedviewModeldefault3(0L))) {
                                        throw TuitionPaymentFragmentspecialinlinedviewModeldefault2("Expected value");
                                    }
                                    if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                                        this.notify = 10;
                                        return 10;
                                    }
                                    throw TuitionPaymentFragmentspecialinlinedviewModeldefault2("Use JsonReader.setLenient(true) to accept malformed JSON");
                                }
                                c3 = 6;
                                if (c != 5) {
                                    i7 = 0;
                                    if (i7 != 0) {
                                        return i7;
                                    }
                                    if (!TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.cancel.TuitionPaymentFragmentspecialinlinedviewModeldefault3(0L))) {
                                        throw TuitionPaymentFragmentspecialinlinedviewModeldefault2("Expected value");
                                    }
                                    if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                                        this.notify = 10;
                                        return 10;
                                    }
                                    throw TuitionPaymentFragmentspecialinlinedviewModeldefault2("Use JsonReader.setLenient(true) to accept malformed JSON");
                                }
                                c = c3;
                                i5 = i6;
                            }
                            c2 = 2;
                            if (c != 2) {
                                if (c != c2) {
                                }
                                this.INotificationSideChannel = i5;
                                this.notify = 17;
                                i7 = 17;
                            } else {
                                if (!z) {
                                }
                                c2 = 2;
                                if (c != c2) {
                                }
                                this.INotificationSideChannel = i5;
                                this.notify = 17;
                                i7 = 17;
                            }
                            if (i7 != 0) {
                                return i7;
                            }
                            if (!TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.cancel.TuitionPaymentFragmentspecialinlinedviewModeldefault3(0L))) {
                                throw TuitionPaymentFragmentspecialinlinedviewModeldefault2("Expected value");
                            }
                            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                                this.notify = 10;
                                return 10;
                            }
                            throw TuitionPaymentFragmentspecialinlinedviewModeldefault2("Use JsonReader.setLenient(true) to accept malformed JSON");
                        }
                    }
                    if (i8 == 1) {
                        this.cancel.cancel();
                        this.notify = 4;
                        return 4;
                    }
                }
                if (i8 == 1 && i8 != 2) {
                    throw TuitionPaymentFragmentspecialinlinedviewModeldefault2("Unexpected value");
                }
                if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                    this.notify = 7;
                    return 7;
                }
                throw TuitionPaymentFragmentspecialinlinedviewModeldefault2("Use JsonReader.setLenient(true) to accept malformed JSON");
            }
        }
        i = 0;
        iTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(true);
        if (iTuitionPaymentFragmentbindingInflater1 != 34) {
            this.cancel.cancel();
            this.notify = 9;
            return 9;
        }
        if (iTuitionPaymentFragmentbindingInflater1 == 39) {
            if (iTuitionPaymentFragmentbindingInflater1 != 44) {
                if (iTuitionPaymentFragmentbindingInflater1 != 91) {
                    this.cancel.cancel();
                    this.notify = 3;
                    return 3;
                }
                if (iTuitionPaymentFragmentbindingInflater1 != 93) {
                    if (iTuitionPaymentFragmentbindingInflater1 != 123) {
                        this.cancel.cancel();
                        this.notify = 1;
                        return 1;
                    }
                    bTuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.cancel.TuitionPaymentFragmentspecialinlinedviewModeldefault3(0L);
                    if (bTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 116) {
                        str = "true";
                        str2 = "TRUE";
                        i2 = 5;
                        length = str.length();
                        i3 = 1;
                        while (true) {
                            if (i3 < length) {
                                i4 = i3 + 1;
                                if (!this.RemoteActionCompatParcelizer.asBinder(i4)) {
                                    i3 = i4;
                                }
                            } else {
                                if (this.RemoteActionCompatParcelizer.asBinder(length + 1)) {
                                }
                                this.cancel.g(length);
                                this.notify = i2;
                                break;
                            }
                            i2 = 0;
                            break;
                        }
                    } else {
                        str = "true";
                        str2 = "TRUE";
                        i2 = 5;
                        length = str.length();
                        i3 = 1;
                        while (true) {
                            if (i3 < length) {
                                i4 = i3 + 1;
                                if (!this.RemoteActionCompatParcelizer.asBinder(i4)) {
                                    i3 = i4;
                                }
                            } else {
                                if (this.RemoteActionCompatParcelizer.asBinder(length + 1)) {
                                }
                                this.cancel.g(length);
                                this.notify = i2;
                                break;
                            }
                            i2 = 0;
                            break;
                        }
                    }
                    if (i2 != 0) {
                        return i2;
                    }
                    z = true;
                    long j4 = 0;
                    c = 0;
                    i5 = 0;
                    boolean z4 = false;
                    while (true) {
                        i6 = i5 + 1;
                        if (this.RemoteActionCompatParcelizer.asBinder(i6)) {
                            bTuitionPaymentFragmentspecialinlinedviewModeldefault5 = this.cancel.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5);
                            if (bTuitionPaymentFragmentspecialinlinedviewModeldefault5 != 43) {
                                if (bTuitionPaymentFragmentspecialinlinedviewModeldefault5 != 69) {
                                    if (c != 2) {
                                    }
                                    c = 5;
                                    i5 = i6;
                                } else {
                                    if (c != 2) {
                                    }
                                    c = 5;
                                    i5 = i6;
                                }
                                if (i7 != 0) {
                                    return i7;
                                }
                                if (!TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.cancel.TuitionPaymentFragmentspecialinlinedviewModeldefault3(0L))) {
                                    throw TuitionPaymentFragmentspecialinlinedviewModeldefault2("Expected value");
                                }
                                if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                                    this.notify = 10;
                                    return 10;
                                }
                                throw TuitionPaymentFragmentspecialinlinedviewModeldefault2("Use JsonReader.setLenient(true) to accept malformed JSON");
                            }
                            c3 = 6;
                            if (c != 5) {
                                i7 = 0;
                                if (i7 != 0) {
                                    return i7;
                                }
                                if (!TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.cancel.TuitionPaymentFragmentspecialinlinedviewModeldefault3(0L))) {
                                    throw TuitionPaymentFragmentspecialinlinedviewModeldefault2("Expected value");
                                }
                                if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                                    this.notify = 10;
                                    return 10;
                                }
                                throw TuitionPaymentFragmentspecialinlinedviewModeldefault2("Use JsonReader.setLenient(true) to accept malformed JSON");
                            }
                            c = c3;
                            i5 = i6;
                        }
                        c2 = 2;
                        if (c != 2) {
                            if (c != c2) {
                            }
                            this.INotificationSideChannel = i5;
                            this.notify = 17;
                            i7 = 17;
                        } else {
                            if (!z) {
                            }
                            c2 = 2;
                            if (c != c2) {
                            }
                            this.INotificationSideChannel = i5;
                            this.notify = 17;
                            i7 = 17;
                        }
                        if (i7 != 0) {
                            return i7;
                        }
                        if (!TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.cancel.TuitionPaymentFragmentspecialinlinedviewModeldefault3(0L))) {
                            throw TuitionPaymentFragmentspecialinlinedviewModeldefault2("Expected value");
                        }
                        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                            this.notify = 10;
                            return 10;
                        }
                        throw TuitionPaymentFragmentspecialinlinedviewModeldefault2("Use JsonReader.setLenient(true) to accept malformed JSON");
                    }
                }
                if (i8 == 1) {
                    this.cancel.cancel();
                    this.notify = 4;
                    return 4;
                }
            }
            if (i8 == 1) {
            }
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                this.notify = 7;
                return 7;
            }
            throw TuitionPaymentFragmentspecialinlinedviewModeldefault2("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            this.cancel.cancel();
            this.notify = 8;
            return 8;
        }
        throw TuitionPaymentFragmentspecialinlinedviewModeldefault2("Use JsonReader.setLenient(true) to accept malformed JSON");
    }

    private String connect() throws IOException {
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int iINotificationSideChannelStubProxy = this.notify;
        if (iINotificationSideChannelStubProxy == 0) {
            iINotificationSideChannelStubProxy = INotificationSideChannelStubProxy();
        }
        if (iINotificationSideChannelStubProxy == 14) {
            strTuitionPaymentFragmentspecialinlinedviewModeldefault1 = getInterfaceDescriptor();
        } else if (iINotificationSideChannelStubProxy == 13) {
            strTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(asInterface);
        } else if (iINotificationSideChannelStubProxy == 12) {
            strTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(f88a);
        } else if (iINotificationSideChannelStubProxy == 15) {
            strTuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.INotificationSideChannelStub;
        } else {
            StringBuilder sb = new StringBuilder("Expected a name but was ");
            sb.append(cancelAll());
            sb.append(" at path ");
            sb.append(TuitionPaymentFragmentspecialinlinedviewModeldefault2());
            throw new JsonDataException(sb.toString());
        }
        this.notify = 0;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2[this.g - 1] = strTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        return strTuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    @Override // com.squareup.moshi.JsonReader
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault1(JsonReader.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1) throws IOException {
        int iINotificationSideChannelStubProxy = this.notify;
        if (iINotificationSideChannelStubProxy == 0) {
            iINotificationSideChannelStubProxy = INotificationSideChannelStubProxy();
        }
        if (iINotificationSideChannelStubProxy < 12 || iINotificationSideChannelStubProxy > 15) {
            return -1;
        }
        if (iINotificationSideChannelStubProxy == 15) {
            return b(this.INotificationSideChannelStub, tuitionPaymentFragmentbindingInflater1);
        }
        int iTuitionPaymentFragmentbindingInflater1 = this.RemoteActionCompatParcelizer.TuitionPaymentFragmentbindingInflater1(tuitionPaymentFragmentbindingInflater1.b);
        if (iTuitionPaymentFragmentbindingInflater1 != -1) {
            this.notify = 0;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2[this.g - 1] = tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2[iTuitionPaymentFragmentbindingInflater1];
            return iTuitionPaymentFragmentbindingInflater1;
        }
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2[this.g - 1];
        String strConnect = connect();
        int iB = b(strConnect, tuitionPaymentFragmentbindingInflater1);
        if (iB == -1) {
            this.notify = 15;
            this.INotificationSideChannelStub = strConnect;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2[this.g - 1] = str;
        }
        return iB;
    }

    @Override // com.squareup.moshi.JsonReader
    public final void INotificationSideChannelDefault() throws IOException {
        if (this.b) {
            JsonReader.Token tokenCancelAll = cancelAll();
            connect();
            StringBuilder sb = new StringBuilder("Cannot skip unexpected ");
            sb.append(tokenCancelAll);
            sb.append(" at ");
            sb.append(TuitionPaymentFragmentspecialinlinedviewModeldefault2());
            throw new JsonDataException(sb.toString());
        }
        int iINotificationSideChannelStubProxy = this.notify;
        if (iINotificationSideChannelStubProxy == 0) {
            iINotificationSideChannelStubProxy = INotificationSideChannelStubProxy();
        }
        if (iINotificationSideChannelStubProxy == 14) {
            MediaBrowserCompat();
        } else if (iINotificationSideChannelStubProxy == 13) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(asInterface);
        } else if (iINotificationSideChannelStubProxy == 12) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(f88a);
        } else if (iINotificationSideChannelStubProxy != 15) {
            StringBuilder sb2 = new StringBuilder("Expected a name but was ");
            sb2.append(cancelAll());
            sb2.append(" at path ");
            sb2.append(TuitionPaymentFragmentspecialinlinedviewModeldefault2());
            throw new JsonDataException(sb2.toString());
        }
        this.notify = 0;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2[this.g - 1] = "null";
    }

    private int b(String str, JsonReader.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1) {
        int length = tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2[i])) {
                this.notify = 0;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2[this.g - 1] = str;
                return i;
            }
        }
        return -1;
    }

    @Override // com.squareup.moshi.JsonReader
    public final String cancel() throws IOException {
        String strB;
        int iINotificationSideChannelStubProxy = this.notify;
        if (iINotificationSideChannelStubProxy == 0) {
            iINotificationSideChannelStubProxy = INotificationSideChannelStubProxy();
        }
        if (iINotificationSideChannelStubProxy == 10) {
            strB = getInterfaceDescriptor();
        } else if (iINotificationSideChannelStubProxy == 9) {
            strB = TuitionPaymentFragmentspecialinlinedviewModeldefault1(asInterface);
        } else if (iINotificationSideChannelStubProxy == 8) {
            strB = TuitionPaymentFragmentspecialinlinedviewModeldefault1(f88a);
        } else if (iINotificationSideChannelStubProxy == 11) {
            strB = this.INotificationSideChannelStub;
            this.INotificationSideChannelStub = null;
        } else if (iINotificationSideChannelStubProxy == 16) {
            strB = Long.toString(this.onTransact);
        } else {
            if (iINotificationSideChannelStubProxy != 17) {
                StringBuilder sb = new StringBuilder("Expected a string but was ");
                sb.append(cancelAll());
                sb.append(" at path ");
                sb.append(TuitionPaymentFragmentspecialinlinedviewModeldefault2());
                throw new JsonDataException(sb.toString());
            }
            strB = this.cancel.b(this.INotificationSideChannel, Charsets.UTF_8);
        }
        this.notify = 0;
        int[] iArr = this.TuitionPaymentFragmentbindingInflater1;
        int i = this.g - 1;
        iArr[i] = iArr[i] + 1;
        return strB;
    }

    @Override // com.squareup.moshi.JsonReader
    public final int TuitionPaymentFragmentbindingInflater1(JsonReader.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1) throws IOException {
        int iINotificationSideChannelStubProxy = this.notify;
        if (iINotificationSideChannelStubProxy == 0) {
            iINotificationSideChannelStubProxy = INotificationSideChannelStubProxy();
        }
        if (iINotificationSideChannelStubProxy < 8 || iINotificationSideChannelStubProxy > 11) {
            return -1;
        }
        if (iINotificationSideChannelStubProxy == 11) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.INotificationSideChannelStub, tuitionPaymentFragmentbindingInflater1);
        }
        int iTuitionPaymentFragmentbindingInflater1 = this.RemoteActionCompatParcelizer.TuitionPaymentFragmentbindingInflater1(tuitionPaymentFragmentbindingInflater1.b);
        if (iTuitionPaymentFragmentbindingInflater1 != -1) {
            this.notify = 0;
            int[] iArr = this.TuitionPaymentFragmentbindingInflater1;
            int i = this.g - 1;
            iArr[i] = iArr[i] + 1;
            return iTuitionPaymentFragmentbindingInflater1;
        }
        String strCancel = cancel();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(strCancel, tuitionPaymentFragmentbindingInflater1);
        if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == -1) {
            this.notify = 11;
            this.INotificationSideChannelStub = strCancel;
            int[] iArr2 = this.TuitionPaymentFragmentbindingInflater1;
            int i2 = this.g - 1;
            iArr2[i2] = iArr2[i2] - 1;
        }
        return iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    private int TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str, JsonReader.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1) {
        int length = tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2[i])) {
                this.notify = 0;
                int[] iArr = this.TuitionPaymentFragmentbindingInflater1;
                int i2 = this.g - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
        }
        return -1;
    }

    @Override // com.squareup.moshi.JsonReader
    public final boolean asInterface() throws IOException {
        int iINotificationSideChannelStubProxy = this.notify;
        if (iINotificationSideChannelStubProxy == 0) {
            iINotificationSideChannelStubProxy = INotificationSideChannelStubProxy();
        }
        if (iINotificationSideChannelStubProxy == 5) {
            this.notify = 0;
            int[] iArr = this.TuitionPaymentFragmentbindingInflater1;
            int i = this.g - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iINotificationSideChannelStubProxy == 6) {
            this.notify = 0;
            int[] iArr2 = this.TuitionPaymentFragmentbindingInflater1;
            int i2 = this.g - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return false;
        }
        StringBuilder sb = new StringBuilder("Expected a boolean but was ");
        sb.append(cancelAll());
        sb.append(" at path ");
        sb.append(TuitionPaymentFragmentspecialinlinedviewModeldefault2());
        throw new JsonDataException(sb.toString());
    }

    @Override // com.squareup.moshi.JsonReader
    public final <T> T INotificationSideChannel() throws IOException {
        int iINotificationSideChannelStubProxy = this.notify;
        if (iINotificationSideChannelStubProxy == 0) {
            iINotificationSideChannelStubProxy = INotificationSideChannelStubProxy();
        }
        if (iINotificationSideChannelStubProxy == 7) {
            this.notify = 0;
            int[] iArr = this.TuitionPaymentFragmentbindingInflater1;
            int i = this.g - 1;
            iArr[i] = iArr[i] + 1;
            return null;
        }
        StringBuilder sb = new StringBuilder("Expected null but was ");
        sb.append(cancelAll());
        sb.append(" at path ");
        sb.append(TuitionPaymentFragmentspecialinlinedviewModeldefault2());
        throw new JsonDataException(sb.toString());
    }

    @Override // com.squareup.moshi.JsonReader
    public final double asBinder() throws IOException {
        int iINotificationSideChannelStubProxy = this.notify;
        if (iINotificationSideChannelStubProxy == 0) {
            iINotificationSideChannelStubProxy = INotificationSideChannelStubProxy();
        }
        if (iINotificationSideChannelStubProxy == 16) {
            this.notify = 0;
            int[] iArr = this.TuitionPaymentFragmentbindingInflater1;
            int i = this.g - 1;
            iArr[i] = iArr[i] + 1;
            return this.onTransact;
        }
        if (iINotificationSideChannelStubProxy == 17) {
            this.INotificationSideChannelStub = this.cancel.b(this.INotificationSideChannel, Charsets.UTF_8);
        } else if (iINotificationSideChannelStubProxy == 9) {
            this.INotificationSideChannelStub = TuitionPaymentFragmentspecialinlinedviewModeldefault1(asInterface);
        } else if (iINotificationSideChannelStubProxy == 8) {
            this.INotificationSideChannelStub = TuitionPaymentFragmentspecialinlinedviewModeldefault1(f88a);
        } else if (iINotificationSideChannelStubProxy == 10) {
            this.INotificationSideChannelStub = getInterfaceDescriptor();
        } else if (iINotificationSideChannelStubProxy != 11) {
            StringBuilder sb = new StringBuilder("Expected a double but was ");
            sb.append(cancelAll());
            sb.append(" at path ");
            sb.append(TuitionPaymentFragmentspecialinlinedviewModeldefault2());
            throw new JsonDataException(sb.toString());
        }
        this.notify = 11;
        try {
            double d2 = Double.parseDouble(this.INotificationSideChannelStub);
            if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 && (Double.isNaN(d2) || Double.isInfinite(d2))) {
                StringBuilder sb2 = new StringBuilder("JSON forbids NaN and infinities: ");
                sb2.append(d2);
                sb2.append(" at path ");
                sb2.append(TuitionPaymentFragmentspecialinlinedviewModeldefault2());
                throw new JsonEncodingException(sb2.toString());
            }
            this.INotificationSideChannelStub = null;
            this.notify = 0;
            int[] iArr2 = this.TuitionPaymentFragmentbindingInflater1;
            int i2 = this.g - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return d2;
        } catch (NumberFormatException unused) {
            StringBuilder sb3 = new StringBuilder("Expected a double but was ");
            sb3.append(this.INotificationSideChannelStub);
            sb3.append(" at path ");
            sb3.append(TuitionPaymentFragmentspecialinlinedviewModeldefault2());
            throw new JsonDataException(sb3.toString());
        }
    }

    @Override // com.squareup.moshi.JsonReader
    public final long d() throws IOException {
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int iINotificationSideChannelStubProxy = this.notify;
        if (iINotificationSideChannelStubProxy == 0) {
            iINotificationSideChannelStubProxy = INotificationSideChannelStubProxy();
        }
        if (iINotificationSideChannelStubProxy == 16) {
            this.notify = 0;
            int[] iArr = this.TuitionPaymentFragmentbindingInflater1;
            int i = this.g - 1;
            iArr[i] = iArr[i] + 1;
            return this.onTransact;
        }
        if (iINotificationSideChannelStubProxy == 17) {
            this.INotificationSideChannelStub = this.cancel.b(this.INotificationSideChannel, Charsets.UTF_8);
        } else if (iINotificationSideChannelStubProxy == 9 || iINotificationSideChannelStubProxy == 8) {
            if (iINotificationSideChannelStubProxy == 9) {
                strTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(asInterface);
            } else {
                strTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(f88a);
            }
            this.INotificationSideChannelStub = strTuitionPaymentFragmentspecialinlinedviewModeldefault1;
            try {
                long j = Long.parseLong(strTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                this.notify = 0;
                int[] iArr2 = this.TuitionPaymentFragmentbindingInflater1;
                int i2 = this.g - 1;
                iArr2[i2] = iArr2[i2] + 1;
                return j;
            } catch (NumberFormatException unused) {
            }
        } else if (iINotificationSideChannelStubProxy != 11) {
            StringBuilder sb = new StringBuilder("Expected a long but was ");
            sb.append(cancelAll());
            sb.append(" at path ");
            sb.append(TuitionPaymentFragmentspecialinlinedviewModeldefault2());
            throw new JsonDataException(sb.toString());
        }
        this.notify = 11;
        try {
            long jLongValueExact = new BigDecimal(this.INotificationSideChannelStub).longValueExact();
            this.INotificationSideChannelStub = null;
            this.notify = 0;
            int[] iArr3 = this.TuitionPaymentFragmentbindingInflater1;
            int i3 = this.g - 1;
            iArr3[i3] = iArr3[i3] + 1;
            return jLongValueExact;
        } catch (ArithmeticException | NumberFormatException unused2) {
            StringBuilder sb2 = new StringBuilder("Expected a long but was ");
            sb2.append(this.INotificationSideChannelStub);
            sb2.append(" at path ");
            sb2.append(TuitionPaymentFragmentspecialinlinedviewModeldefault2());
            throw new JsonDataException(sb2.toString());
        }
    }

    private String TuitionPaymentFragmentspecialinlinedviewModeldefault1(ByteString byteString) throws IOException {
        StringBuilder sb = null;
        while (true) {
            long jB = this.RemoteActionCompatParcelizer.b(byteString);
            if (jB == -1) {
                throw TuitionPaymentFragmentspecialinlinedviewModeldefault2("Unterminated string");
            }
            if (this.cancel.TuitionPaymentFragmentspecialinlinedviewModeldefault3(jB) != 92) {
                if (sb != null) {
                    sb.append(this.cancel.b(jB, Charsets.UTF_8));
                    this.cancel.cancel();
                    return sb.toString();
                }
                String strB = this.cancel.b(jB, Charsets.UTF_8);
                this.cancel.cancel();
                return strB;
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            sb.append(this.cancel.b(jB, Charsets.UTF_8));
            this.cancel.cancel();
            sb.append(INotificationSideChannelStub());
        }
    }

    private String getInterfaceDescriptor() throws IOException {
        long jB = this.RemoteActionCompatParcelizer.b(cancelAll);
        if (jB == -1) {
            RotationProviderListenerWrapper rotationProviderListenerWrapper = this.cancel;
            return rotationProviderListenerWrapper.b(rotationProviderListenerWrapper.size, Charsets.UTF_8);
        }
        return this.cancel.b(jB, Charsets.UTF_8);
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault3(ByteString byteString) throws IOException {
        while (true) {
            long jB = this.RemoteActionCompatParcelizer.b(byteString);
            if (jB == -1) {
                throw TuitionPaymentFragmentspecialinlinedviewModeldefault2("Unterminated string");
            }
            if (this.cancel.TuitionPaymentFragmentspecialinlinedviewModeldefault3(jB) == 92) {
                this.cancel.g(jB + 1);
                INotificationSideChannelStub();
            } else {
                this.cancel.g(jB + 1);
                return;
            }
        }
    }

    private void MediaBrowserCompat() throws IOException {
        long jB = this.RemoteActionCompatParcelizer.b(cancelAll);
        RotationProviderListenerWrapper rotationProviderListenerWrapper = this.cancel;
        if (jB == -1) {
            jB = rotationProviderListenerWrapper.size;
        }
        rotationProviderListenerWrapper.g(jB);
    }

    @Override // com.squareup.moshi.JsonReader
    public final int g() throws IOException {
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int iINotificationSideChannelStubProxy = this.notify;
        if (iINotificationSideChannelStubProxy == 0) {
            iINotificationSideChannelStubProxy = INotificationSideChannelStubProxy();
        }
        if (iINotificationSideChannelStubProxy == 16) {
            long j = this.onTransact;
            int i = (int) j;
            if (j != i) {
                StringBuilder sb = new StringBuilder("Expected an int but was ");
                sb.append(this.onTransact);
                sb.append(" at path ");
                sb.append(TuitionPaymentFragmentspecialinlinedviewModeldefault2());
                throw new JsonDataException(sb.toString());
            }
            this.notify = 0;
            int[] iArr = this.TuitionPaymentFragmentbindingInflater1;
            int i2 = this.g - 1;
            iArr[i2] = iArr[i2] + 1;
            return i;
        }
        if (iINotificationSideChannelStubProxy == 17) {
            this.INotificationSideChannelStub = this.cancel.b(this.INotificationSideChannel, Charsets.UTF_8);
        } else if (iINotificationSideChannelStubProxy == 9 || iINotificationSideChannelStubProxy == 8) {
            if (iINotificationSideChannelStubProxy == 9) {
                strTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(asInterface);
            } else {
                strTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(f88a);
            }
            this.INotificationSideChannelStub = strTuitionPaymentFragmentspecialinlinedviewModeldefault1;
            try {
                int i3 = Integer.parseInt(strTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                this.notify = 0;
                int[] iArr2 = this.TuitionPaymentFragmentbindingInflater1;
                int i4 = this.g - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return i3;
            } catch (NumberFormatException unused) {
            }
        } else if (iINotificationSideChannelStubProxy != 11) {
            StringBuilder sb2 = new StringBuilder("Expected an int but was ");
            sb2.append(cancelAll());
            sb2.append(" at path ");
            sb2.append(TuitionPaymentFragmentspecialinlinedviewModeldefault2());
            throw new JsonDataException(sb2.toString());
        }
        this.notify = 11;
        try {
            double d2 = Double.parseDouble(this.INotificationSideChannelStub);
            int i5 = (int) d2;
            if (i5 != d2) {
                StringBuilder sb3 = new StringBuilder("Expected an int but was ");
                sb3.append(this.INotificationSideChannelStub);
                sb3.append(" at path ");
                sb3.append(TuitionPaymentFragmentspecialinlinedviewModeldefault2());
                throw new JsonDataException(sb3.toString());
            }
            this.INotificationSideChannelStub = null;
            this.notify = 0;
            int[] iArr3 = this.TuitionPaymentFragmentbindingInflater1;
            int i6 = this.g - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        } catch (NumberFormatException unused2) {
            StringBuilder sb4 = new StringBuilder("Expected an int but was ");
            sb4.append(this.INotificationSideChannelStub);
            sb4.append(" at path ");
            sb4.append(TuitionPaymentFragmentspecialinlinedviewModeldefault2());
            throw new JsonDataException(sb4.toString());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.notify = 0;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0] = 8;
        this.g = 1;
        RotationProviderListenerWrapper rotationProviderListenerWrapper = this.cancel;
        rotationProviderListenerWrapper.g(rotationProviderListenerWrapper.size);
        this.RemoteActionCompatParcelizer.close();
    }

    @Override // com.squareup.moshi.JsonReader
    public final void RemoteActionCompatParcelizer() throws IOException {
        if (this.b) {
            StringBuilder sb = new StringBuilder("Cannot skip unexpected ");
            sb.append(cancelAll());
            sb.append(" at ");
            sb.append(TuitionPaymentFragmentspecialinlinedviewModeldefault2());
            throw new JsonDataException(sb.toString());
        }
        int i = 0;
        do {
            int iINotificationSideChannelStubProxy = this.notify;
            if (iINotificationSideChannelStubProxy == 0) {
                iINotificationSideChannelStubProxy = INotificationSideChannelStubProxy();
            }
            if (iINotificationSideChannelStubProxy == 3) {
                TuitionPaymentFragmentbindingInflater1(1);
            } else {
                if (iINotificationSideChannelStubProxy == 1) {
                    TuitionPaymentFragmentbindingInflater1(3);
                } else if (iINotificationSideChannelStubProxy == 4) {
                    i--;
                    if (i < 0) {
                        StringBuilder sb2 = new StringBuilder("Expected a value but was ");
                        sb2.append(cancelAll());
                        sb2.append(" at path ");
                        sb2.append(TuitionPaymentFragmentspecialinlinedviewModeldefault2());
                        throw new JsonDataException(sb2.toString());
                    }
                    this.g--;
                } else if (iINotificationSideChannelStubProxy == 2) {
                    i--;
                    if (i < 0) {
                        StringBuilder sb3 = new StringBuilder("Expected a value but was ");
                        sb3.append(cancelAll());
                        sb3.append(" at path ");
                        sb3.append(TuitionPaymentFragmentspecialinlinedviewModeldefault2());
                        throw new JsonDataException(sb3.toString());
                    }
                    this.g--;
                } else if (iINotificationSideChannelStubProxy == 14 || iINotificationSideChannelStubProxy == 10) {
                    MediaBrowserCompat();
                } else if (iINotificationSideChannelStubProxy == 9 || iINotificationSideChannelStubProxy == 13) {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3(asInterface);
                } else if (iINotificationSideChannelStubProxy == 8 || iINotificationSideChannelStubProxy == 12) {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3(f88a);
                } else if (iINotificationSideChannelStubProxy == 17) {
                    this.cancel.g(this.INotificationSideChannel);
                } else if (iINotificationSideChannelStubProxy == 18) {
                    StringBuilder sb4 = new StringBuilder("Expected a value but was ");
                    sb4.append(cancelAll());
                    sb4.append(" at path ");
                    sb4.append(TuitionPaymentFragmentspecialinlinedviewModeldefault2());
                    throw new JsonDataException(sb4.toString());
                }
                this.notify = 0;
            }
            i++;
            this.notify = 0;
        } while (i != 0);
        int[] iArr = this.TuitionPaymentFragmentbindingInflater1;
        int i2 = this.g - 1;
        iArr[i2] = iArr[i2] + 1;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2[this.g - 1] = "null";
    }

    private int TuitionPaymentFragmentbindingInflater1(boolean z) throws IOException {
        int i;
        long j;
        byte bTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        while (true) {
            while (true) {
                int i2 = i + 1;
                if (!this.RemoteActionCompatParcelizer.asBinder(i2)) {
                    if (z) {
                        throw new EOFException("End of input");
                    }
                    return -1;
                }
                j = i;
                bTuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.cancel.TuitionPaymentFragmentspecialinlinedviewModeldefault3(j);
                i = (bTuitionPaymentFragmentspecialinlinedviewModeldefault3 == 10 || bTuitionPaymentFragmentspecialinlinedviewModeldefault3 == 32 || bTuitionPaymentFragmentspecialinlinedviewModeldefault3 == 13 || bTuitionPaymentFragmentspecialinlinedviewModeldefault3 == 9) ? i2 : 0;
            }
            this.cancel.g(j);
            if (bTuitionPaymentFragmentspecialinlinedviewModeldefault3 == 47) {
                if (this.RemoteActionCompatParcelizer.asBinder(2L)) {
                    if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                        byte bTuitionPaymentFragmentspecialinlinedviewModeldefault4 = this.cancel.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1L);
                        if (bTuitionPaymentFragmentspecialinlinedviewModeldefault4 == 42) {
                            this.cancel.cancel();
                            this.cancel.cancel();
                            if (!read()) {
                                throw TuitionPaymentFragmentspecialinlinedviewModeldefault2("Unterminated comment");
                            }
                        } else if (bTuitionPaymentFragmentspecialinlinedviewModeldefault4 == 47) {
                            this.cancel.cancel();
                            this.cancel.cancel();
                            write();
                        }
                    } else {
                        throw TuitionPaymentFragmentspecialinlinedviewModeldefault2("Use JsonReader.setLenient(true) to accept malformed JSON");
                    }
                }
                return bTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            }
            if (bTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 35) {
                return bTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            }
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                write();
            } else {
                throw TuitionPaymentFragmentspecialinlinedviewModeldefault2("Use JsonReader.setLenient(true) to accept malformed JSON");
            }
        }
    }

    private void write() throws IOException {
        long jB = this.RemoteActionCompatParcelizer.b(asBinder);
        RotationProviderListenerWrapper rotationProviderListenerWrapper = this.cancel;
        rotationProviderListenerWrapper.g(jB != -1 ? jB + 1 : rotationProviderListenerWrapper.size);
    }

    private boolean read() throws IOException {
        long jTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        RotationProvider1 rotationProvider1 = this.RemoteActionCompatParcelizer;
        ByteString byteString = d;
        long jTuitionPaymentFragmentspecialinlinedviewModeldefault4 = rotationProvider1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(byteString);
        boolean z = jTuitionPaymentFragmentspecialinlinedviewModeldefault4 != -1;
        RotationProviderListenerWrapper rotationProviderListenerWrapper = this.cancel;
        if (z) {
            jTuitionPaymentFragmentspecialinlinedviewModeldefault3 = jTuitionPaymentFragmentspecialinlinedviewModeldefault4 + ((long) byteString.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        } else {
            jTuitionPaymentFragmentspecialinlinedviewModeldefault3 = rotationProviderListenerWrapper.size;
        }
        rotationProviderListenerWrapper.g(jTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        return z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JsonReader(");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    private char INotificationSideChannelStub() throws IOException {
        int i;
        if (!this.RemoteActionCompatParcelizer.asBinder(1L)) {
            throw TuitionPaymentFragmentspecialinlinedviewModeldefault2("Unterminated escape sequence");
        }
        byte bCancel = this.cancel.cancel();
        if (bCancel == 10 || bCancel == 34 || bCancel == 39 || bCancel == 47 || bCancel == 92) {
            return (char) bCancel;
        }
        if (bCancel == 98) {
            return '\b';
        }
        if (bCancel == 102) {
            return '\f';
        }
        if (bCancel == 110) {
            return '\n';
        }
        if (bCancel == 114) {
            return '\r';
        }
        if (bCancel == 116) {
            return '\t';
        }
        if (bCancel == 117) {
            if (!this.RemoteActionCompatParcelizer.asBinder(4L)) {
                StringBuilder sb = new StringBuilder("Unterminated escape sequence at path ");
                sb.append(TuitionPaymentFragmentspecialinlinedviewModeldefault2());
                throw new EOFException(sb.toString());
            }
            char c = 0;
            for (int i2 = 0; i2 < 4; i2++) {
                byte bTuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.cancel.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i2);
                char c2 = (char) (c << 4);
                if (bTuitionPaymentFragmentspecialinlinedviewModeldefault3 >= 48 && bTuitionPaymentFragmentspecialinlinedviewModeldefault3 <= 57) {
                    i = bTuitionPaymentFragmentspecialinlinedviewModeldefault3 - 48;
                } else if (bTuitionPaymentFragmentspecialinlinedviewModeldefault3 >= 97 && bTuitionPaymentFragmentspecialinlinedviewModeldefault3 <= 102) {
                    i = bTuitionPaymentFragmentspecialinlinedviewModeldefault3 - 87;
                } else {
                    if (bTuitionPaymentFragmentspecialinlinedviewModeldefault3 < 65 || bTuitionPaymentFragmentspecialinlinedviewModeldefault3 > 70) {
                        StringBuilder sb2 = new StringBuilder("\\u");
                        sb2.append(this.cancel.b(4L, Charsets.UTF_8));
                        throw TuitionPaymentFragmentspecialinlinedviewModeldefault2(sb2.toString());
                    }
                    i = bTuitionPaymentFragmentspecialinlinedviewModeldefault3 - 55;
                }
                c = (char) (c2 + i);
            }
            this.cancel.g(4L);
            return c;
        }
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            return (char) bCancel;
        }
        StringBuilder sb3 = new StringBuilder("Invalid escape sequence: \\");
        sb3.append((char) bCancel);
        throw TuitionPaymentFragmentspecialinlinedviewModeldefault2(sb3.toString());
    }

    @Override // com.squareup.moshi.JsonReader
    public final void onTransact() throws IOException {
        if (a()) {
            this.INotificationSideChannelStub = connect();
            this.notify = 11;
        }
    }

    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i) throws IOException {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (i != 47 && i != 61) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            return false;
        }
        throw TuitionPaymentFragmentspecialinlinedviewModeldefault2("Use JsonReader.setLenient(true) to accept malformed JSON");
    }
}
