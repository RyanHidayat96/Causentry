package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import at.favre.lib.armadillo.EncryptionProtocolException;
import at.favre.lib.bytes.Bytes;
import at.favre.lib.bytes.BytesTransformer;
import at.favre.lib.bytes.MutableBytes;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class isCurrent implements onItemLoaded {
    private final MediaBrowserCompatMediaBrowserImplApi215.TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentbindingInflater1;
    private MediaBrowserCompatMediaBrowserImplApi215 TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private MediaBrowserCompatItemReceiver TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final getStateLabel f1220a;
    private final List<Object> asInterface;
    private byte[] b;
    private boolean d;
    private final SharedPreferences g;

    public isCurrent(Context context, String str, MediaBrowserCompatMediaBrowserImplApi215.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2, getStateLabel getstatelabel, char[] cArr, boolean z) {
        this(context.getSharedPreferences(tuitionPaymentFragmentspecialinlinedviewModeldefault2.b().b(str, "prefName"), 0), tuitionPaymentFragmentspecialinlinedviewModeldefault2, getstatelabel, cArr, z);
    }

    public isCurrent(SharedPreferences sharedPreferences, MediaBrowserCompatMediaBrowserImplApi215.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2, getStateLabel getstatelabel, char[] cArr, boolean z) throws IOException {
        this.asInterface = new LinkedList();
        getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault1("create new secure shared preferences", new Object[0]);
        this.g = sharedPreferences;
        this.TuitionPaymentFragmentbindingInflater1 = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
        this.f1220a = getstatelabel;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1(cArr);
        this.d = z;
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() throws IOException {
        byte[] bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1.b(), this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1(), this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        this.b = bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1(bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1);
        if (!this.d || contains("at.favre.lib.securepref.PASSWORD_VALIDATION_KEY")) {
            return;
        }
        byte[] bArr = this.b;
        SharedPreferences.Editor editorEdit = edit();
        Bytes bytesB = Bytes.b(bArr);
        editorEdit.putString("at.favre.lib.securepref.PASSWORD_VALIDATION_KEY", new MediaBrowserCompatMediaBrowserImplBase1.TuitionPaymentFragmentbindingInflater1(false, true).b(bytesB.byteArray, bytesB.byteOrder)).apply();
    }

    private byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault1(MediaBrowserCompatMediaBrowserImplBase3 mediaBrowserCompatMediaBrowserImplBase3, MediaBrowserCompatItemCallbackStubApi23 mediaBrowserCompatItemCallbackStubApi23, SecureRandom secureRandom) throws IOException {
        MutableBytes mutableBytes;
        String strB = mediaBrowserCompatMediaBrowserImplBase3.b("at.favre.lib.securepref.KEY_RANDOM", "prefName");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = strB;
        String string = this.g.getString(strB, null);
        if (string == null) {
            getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault3("create new preferences random salt", new Object[0]);
            byte[] bArr = Bytes.b(32, secureRandom).byteArray;
            try {
                Bytes bytesB = Bytes.b(bArr);
                byte[] bArr2 = bytesB.factory.b(new BytesTransformer.TuitionPaymentFragmentspecialinlinedviewModeldefault1(0, bytesB.byteArray.length).b(bytesB.byteArray, bytesB.TuitionPaymentFragmentspecialinlinedviewModeldefault1()), bytesB.byteOrder).byteArray;
                mediaBrowserCompatItemCallbackStubApi23.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bArr);
                SharedPreferences.Editor editorEdit = this.g.edit();
                String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                Bytes bytesB2 = Bytes.b(bArr);
                editorEdit.putString(str, new MediaBrowserCompatMediaBrowserImplBase1.TuitionPaymentFragmentbindingInflater1(false, true).b(bytesB2.byteArray, bytesB2.byteOrder)).apply();
                return bArr2;
            } finally {
                Bytes bytesTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Bytes.TuitionPaymentFragmentspecialinlinedviewModeldefault2(bArr);
                if (bytesTuitionPaymentFragmentspecialinlinedviewModeldefault2 instanceof MutableBytes) {
                    mutableBytes = (MutableBytes) bytesTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                } else {
                    mutableBytes = new MutableBytes(bytesTuitionPaymentFragmentspecialinlinedviewModeldefault2.byteArray, bytesTuitionPaymentFragmentspecialinlinedviewModeldefault2.byteOrder);
                }
                SecureRandom secureRandom2 = new SecureRandom();
                if (mutableBytes.byteArray.length > 0) {
                    secureRandom2.nextBytes(mutableBytes.byteArray);
                }
            }
        }
        byte[] bArr3 = Bytes.b(string).byteArray;
        mediaBrowserCompatItemCallbackStubApi23.TuitionPaymentFragmentspecialinlinedviewModeldefault1(bArr3);
        return bArr3;
    }

    @Override // android.content.SharedPreferences
    public final Map<String, String> getAll() {
        Map<String, ?> all = this.g.getAll();
        HashMap map = new HashMap(all.size());
        for (String str : all.keySet()) {
            if (!str.equals(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3)) {
                map.put(str, "");
            }
        }
        return map;
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        byte[] bArrTuitionPaymentFragmentbindingInflater1;
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(str);
        String string = this.g.getString(strTuitionPaymentFragmentspecialinlinedviewModeldefault3, null);
        return (string == null || (bArrTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(strTuitionPaymentFragmentspecialinlinedviewModeldefault3, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, string)) == null) ? str2 : new String(Bytes.TuitionPaymentFragmentbindingInflater1(bArrTuitionPaymentFragmentbindingInflater1).byteArray, (Charset) Objects.requireNonNull(StandardCharsets.UTF_8, "given charset must not be null"));
    }

    @Override // android.content.SharedPreferences
    public final Set<String> getStringSet(String str, Set<String> set) {
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(str);
        Set<String> stringSet = this.g.getStringSet(strTuitionPaymentFragmentspecialinlinedviewModeldefault3, null);
        if (stringSet == null) {
            return set;
        }
        HashSet hashSet = new HashSet(stringSet.size());
        Iterator<String> it = stringSet.iterator();
        while (it.hasNext()) {
            byte[] bArrTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(strTuitionPaymentFragmentspecialinlinedviewModeldefault3, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, it.next());
            if (bArrTuitionPaymentFragmentbindingInflater1 == null) {
                break;
            }
            hashSet.add(new String(Bytes.TuitionPaymentFragmentbindingInflater1(bArrTuitionPaymentFragmentbindingInflater1).byteArray, (Charset) Objects.requireNonNull(StandardCharsets.UTF_8, "given charset must not be null")));
        }
        return hashSet;
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i) {
        byte[] bArrTuitionPaymentFragmentbindingInflater1;
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(str);
        String string = this.g.getString(strTuitionPaymentFragmentspecialinlinedviewModeldefault3, null);
        if (string == null || (bArrTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(strTuitionPaymentFragmentspecialinlinedviewModeldefault3, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, string)) == null) {
            return i;
        }
        Bytes bytesTuitionPaymentFragmentbindingInflater1 = Bytes.TuitionPaymentFragmentbindingInflater1(bArrTuitionPaymentFragmentbindingInflater1);
        MediaBrowserCompatMediaBrowserImplBase6.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(bytesTuitionPaymentFragmentbindingInflater1.byteArray.length, 4, "int");
        MediaBrowserCompatMediaBrowserImplBase6.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(bytesTuitionPaymentFragmentbindingInflater1.byteArray.length, 0, 4, "int");
        return ((ByteBuffer) ByteBuffer.wrap(bytesTuitionPaymentFragmentbindingInflater1.byteArray).order(bytesTuitionPaymentFragmentbindingInflater1.byteOrder).position(0)).getInt();
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j) {
        byte[] bArrTuitionPaymentFragmentbindingInflater1;
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(str);
        String string = this.g.getString(strTuitionPaymentFragmentspecialinlinedviewModeldefault3, null);
        if (string == null || (bArrTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(strTuitionPaymentFragmentspecialinlinedviewModeldefault3, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, string)) == null) {
            return j;
        }
        Bytes bytesTuitionPaymentFragmentbindingInflater1 = Bytes.TuitionPaymentFragmentbindingInflater1(bArrTuitionPaymentFragmentbindingInflater1);
        MediaBrowserCompatMediaBrowserImplBase6.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(bytesTuitionPaymentFragmentbindingInflater1.byteArray.length, 8, "long");
        MediaBrowserCompatMediaBrowserImplBase6.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(bytesTuitionPaymentFragmentbindingInflater1.byteArray.length, 0, 8, "long");
        return ((ByteBuffer) ByteBuffer.wrap(bytesTuitionPaymentFragmentbindingInflater1.byteArray).order(bytesTuitionPaymentFragmentbindingInflater1.byteOrder).position(0)).getLong();
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f) {
        byte[] bArrTuitionPaymentFragmentbindingInflater1;
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(str);
        String string = this.g.getString(strTuitionPaymentFragmentspecialinlinedviewModeldefault3, null);
        if (string == null || (bArrTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(strTuitionPaymentFragmentspecialinlinedviewModeldefault3, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, string)) == null) {
            return f;
        }
        Bytes bytesTuitionPaymentFragmentbindingInflater1 = Bytes.TuitionPaymentFragmentbindingInflater1(bArrTuitionPaymentFragmentbindingInflater1);
        MediaBrowserCompatMediaBrowserImplBase6.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(bytesTuitionPaymentFragmentbindingInflater1.byteArray.length, 4, TypedValues.Custom.S_FLOAT);
        return ByteBuffer.wrap(bytesTuitionPaymentFragmentbindingInflater1.byteArray).order(bytesTuitionPaymentFragmentbindingInflater1.byteOrder).getFloat();
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z) {
        byte[] bArrTuitionPaymentFragmentbindingInflater1;
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(str);
        String string = this.g.getString(strTuitionPaymentFragmentspecialinlinedviewModeldefault3, null);
        if (string != null && (bArrTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(strTuitionPaymentFragmentspecialinlinedviewModeldefault3, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, string)) != null) {
            z = false;
            if (bArrTuitionPaymentFragmentbindingInflater1[0] != 0) {
                return true;
            }
        }
        return z;
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        return this.g.contains(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(str));
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        return new TuitionPaymentFragmentbindingInflater1(this, (byte) 0);
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.g.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.g.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    public final class TuitionPaymentFragmentbindingInflater1 implements SharedPreferences.Editor {
        private boolean TuitionPaymentFragmentbindingInflater1;
        private final SharedPreferences.Editor TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        /* synthetic */ TuitionPaymentFragmentbindingInflater1(isCurrent iscurrent, byte b) {
            this();
        }

        private TuitionPaymentFragmentbindingInflater1() {
            this.TuitionPaymentFragmentbindingInflater1 = false;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = isCurrent.this.g.edit();
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putString(String str, String str2) {
            String strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = isCurrent.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(str);
            if (str2 == null) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.remove(isCurrent.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(str));
                return this;
            }
            SharedPreferences.Editor editor = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            isCurrent iscurrent = isCurrent.this;
            editor.putString(strTuitionPaymentFragmentspecialinlinedviewModeldefault3, iscurrent.TuitionPaymentFragmentspecialinlinedviewModeldefault1(strTuitionPaymentFragmentspecialinlinedviewModeldefault3, iscurrent.TuitionPaymentFragmentspecialinlinedviewModeldefault2, Bytes.TuitionPaymentFragmentbindingInflater1(str2).byteArray));
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            String strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = isCurrent.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(str);
            if (set == null) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.remove(isCurrent.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(str));
                return this;
            }
            HashSet hashSet = new HashSet(set.size());
            for (String str2 : set) {
                isCurrent iscurrent = isCurrent.this;
                hashSet.add(iscurrent.TuitionPaymentFragmentspecialinlinedviewModeldefault1(strTuitionPaymentFragmentspecialinlinedviewModeldefault3, iscurrent.TuitionPaymentFragmentspecialinlinedviewModeldefault2, Bytes.TuitionPaymentFragmentbindingInflater1(str2).byteArray));
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.putStringSet(strTuitionPaymentFragmentspecialinlinedviewModeldefault3, hashSet);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putInt(String str, int i) {
            String strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = isCurrent.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(str);
            SharedPreferences.Editor editor = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            isCurrent iscurrent = isCurrent.this;
            editor.putString(strTuitionPaymentFragmentspecialinlinedviewModeldefault3, iscurrent.TuitionPaymentFragmentspecialinlinedviewModeldefault1(strTuitionPaymentFragmentspecialinlinedviewModeldefault3, iscurrent.TuitionPaymentFragmentspecialinlinedviewModeldefault2, Bytes.b(i).byteArray));
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putLong(String str, long j) {
            String strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = isCurrent.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(str);
            SharedPreferences.Editor editor = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            isCurrent iscurrent = isCurrent.this;
            editor.putString(strTuitionPaymentFragmentspecialinlinedviewModeldefault3, iscurrent.TuitionPaymentFragmentspecialinlinedviewModeldefault1(strTuitionPaymentFragmentspecialinlinedviewModeldefault3, iscurrent.TuitionPaymentFragmentspecialinlinedviewModeldefault2, Bytes.TuitionPaymentFragmentspecialinlinedviewModeldefault3(j).byteArray));
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putFloat(String str, float f) {
            String strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = isCurrent.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(str);
            SharedPreferences.Editor editor = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            isCurrent iscurrent = isCurrent.this;
            editor.putString(strTuitionPaymentFragmentspecialinlinedviewModeldefault3, iscurrent.TuitionPaymentFragmentspecialinlinedviewModeldefault1(strTuitionPaymentFragmentspecialinlinedviewModeldefault3, iscurrent.TuitionPaymentFragmentspecialinlinedviewModeldefault2, Bytes.b(f).byteArray));
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putBoolean(String str, boolean z) {
            String strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = isCurrent.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(str);
            SharedPreferences.Editor editor = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            isCurrent iscurrent = isCurrent.this;
            editor.putString(strTuitionPaymentFragmentspecialinlinedviewModeldefault3, iscurrent.TuitionPaymentFragmentspecialinlinedviewModeldefault1(strTuitionPaymentFragmentspecialinlinedviewModeldefault3, iscurrent.TuitionPaymentFragmentspecialinlinedviewModeldefault2, Bytes.b(z ? (byte) 1 : (byte) 0).byteArray));
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor remove(String str) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.remove(isCurrent.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(str));
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor clear() {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.clear();
            this.TuitionPaymentFragmentbindingInflater1 = true;
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final boolean commit() throws IOException {
            try {
                return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.commit();
            } finally {
                if (this.TuitionPaymentFragmentbindingInflater1) {
                    isCurrent.this.b();
                }
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public final void apply() throws IOException {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.apply();
            if (this.TuitionPaymentFragmentbindingInflater1) {
                isCurrent.this.b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str, MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver, byte[] bArr) {
        try {
            MediaBrowserCompatMediaBrowserImplApi215 mediaBrowserCompatMediaBrowserImplApi215 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            Bytes bytesB = Bytes.b(mediaBrowserCompatMediaBrowserImplApi215.b(str, mediaBrowserCompatMediaBrowserImplApi215.TuitionPaymentFragmentspecialinlinedviewModeldefault1(mediaBrowserCompatItemReceiver), bArr));
            return new MediaBrowserCompatMediaBrowserImplBase1.TuitionPaymentFragmentbindingInflater1(false, true).b(bytesB.byteArray, bytesB.byteOrder);
        } catch (EncryptionProtocolException e2) {
            throw new IllegalStateException(e2);
        }
    }

    private byte[] TuitionPaymentFragmentbindingInflater1(String str, MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver, String str2) {
        try {
            MediaBrowserCompatMediaBrowserImplApi215 mediaBrowserCompatMediaBrowserImplApi215 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            return mediaBrowserCompatMediaBrowserImplApi215.TuitionPaymentFragmentbindingInflater1(str, mediaBrowserCompatMediaBrowserImplApi215.TuitionPaymentFragmentspecialinlinedviewModeldefault1(mediaBrowserCompatItemReceiver), Bytes.b(str2).byteArray);
        } catch (EncryptionProtocolException e2) {
            this.f1220a.TuitionPaymentFragmentspecialinlinedviewModeldefault2(e2, str, this);
            return null;
        }
    }
}
