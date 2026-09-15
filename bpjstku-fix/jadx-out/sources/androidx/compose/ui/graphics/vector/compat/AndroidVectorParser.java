package androidx.compose.ui.graphics.vector.compat;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.compose.ui.graphics.vector.PathParser;
import androidx.core.content.res.ComplexColorCompat;
import androidx.core.content.res.TypedArrayUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ5\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u000b2\f\u0010\u0005\u001a\b\u0018\u00010\fR\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J-\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ%\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b!\u0010\"J%\u0010#\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0017¢\u0006\u0004\b#\u0010\u001eJ=\u0010&\u001a\u00020%2\u0006\u0010\u0003\u001a\u00020\u00112\f\u0010\u0005\u001a\b\u0018\u00010\fR\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u0004H\u0007¢\u0006\u0004\b&\u0010'J5\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010\u0003\u001a\u00020\u00112\f\u0010\u0005\u001a\b\u0018\u00010\fR\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b-\u0010.J$\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÇ\u0001¢\u0006\u0004\b/\u00100J\u001a\u00101\u001a\u00020\u001a2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b3\u0010.J\u0010\u00104\u001a\u00020\u0014H×\u0001¢\u0006\u0004\b4\u00105R\u001a\u00106\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u0010,R\"\u00109\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010.\"\u0004\b<\u0010\nR\u0014\u0010>\u001a\u00020=8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b>\u0010?"}, d2 = {"Landroidx/compose/ui/graphics/vector/compat/AndroidVectorParser;", "", "Lorg/xmlpull/v1/XmlPullParser;", "p0", "", "p1", "<init>", "(Lorg/xmlpull/v1/XmlPullParser;I)V", "", "updateConfig", "(I)V", "Landroid/content/res/Resources;", "Landroid/content/res/Resources$Theme;", "Landroid/util/AttributeSet;", "p2", "", "p3", "Landroid/content/res/TypedArray;", "obtainAttributes", "(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;", "", "getNamedInt", "(Landroid/content/res/TypedArray;Ljava/lang/String;II)I", "", "getNamedFloat", "(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F", "", "getNamedBoolean", "(Landroid/content/res/TypedArray;Ljava/lang/String;IZ)Z", "getFloat", "(Landroid/content/res/TypedArray;IF)F", "getInt", "(Landroid/content/res/TypedArray;II)I", "getString", "(Landroid/content/res/TypedArray;I)Ljava/lang/String;", "getDimension", "p4", "Landroidx/core/content/res/ComplexColorCompat;", "getNamedComplexColor", "(Landroid/content/res/TypedArray;Landroid/content/res/Resources$Theme;Ljava/lang/String;II)Landroidx/core/content/res/ComplexColorCompat;", "Landroid/content/res/ColorStateList;", "getNamedColorStateList", "(Landroid/content/res/TypedArray;Landroid/content/res/Resources$Theme;Ljava/lang/String;I)Landroid/content/res/ColorStateList;", "component1", "()Lorg/xmlpull/v1/XmlPullParser;", "component2", "()I", "copy", "(Lorg/xmlpull/v1/XmlPullParser;I)Landroidx/compose/ui/graphics/vector/compat/AndroidVectorParser;", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "xmlParser", "Lorg/xmlpull/v1/XmlPullParser;", "getXmlParser", "config", "I", "getConfig", "setConfig", "Landroidx/compose/ui/graphics/vector/PathParser;", "pathParser", "Landroidx/compose/ui/graphics/vector/PathParser;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AndroidVectorParser {
    public static final int $stable = 8;
    private int config;
    public final PathParser pathParser;
    private final XmlPullParser xmlParser;

    public AndroidVectorParser(XmlPullParser xmlPullParser, int i) {
        this.xmlParser = xmlPullParser;
        this.config = i;
        this.pathParser = new PathParser();
    }

    public /* synthetic */ AndroidVectorParser(XmlPullParser xmlPullParser, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(xmlPullParser, (i2 & 2) != 0 ? 0 : i);
    }

    public final int getConfig() {
        return this.config;
    }

    public final XmlPullParser getXmlParser() {
        return this.xmlParser;
    }

    public final void setConfig(int i) {
        this.config = i;
    }

    private final void updateConfig(int p0) {
        this.config = p0 | this.config;
    }

    public final TypedArray obtainAttributes(Resources p0, Resources.Theme p1, AttributeSet p2, int[] p3) {
        TypedArray typedArrayObtainAttributes = TypedArrayUtils.obtainAttributes(p0, p1, p2, p3);
        updateConfig(typedArrayObtainAttributes.getChangingConfigurations());
        return typedArrayObtainAttributes;
    }

    public final int getNamedInt(TypedArray p0, String p1, int p2, int p3) {
        int namedInt = TypedArrayUtils.getNamedInt(p0, this.xmlParser, p1, p2, p3);
        updateConfig(p0.getChangingConfigurations());
        return namedInt;
    }

    public final float getNamedFloat(TypedArray p0, String p1, int p2, float p3) {
        float namedFloat = TypedArrayUtils.getNamedFloat(p0, this.xmlParser, p1, p2, p3);
        updateConfig(p0.getChangingConfigurations());
        return namedFloat;
    }

    public final boolean getNamedBoolean(TypedArray p0, String p1, int p2, boolean p3) {
        boolean namedBoolean = TypedArrayUtils.getNamedBoolean(p0, this.xmlParser, p1, p2, p3);
        updateConfig(p0.getChangingConfigurations());
        return namedBoolean;
    }

    public final float getFloat(TypedArray p0, int p1, float p2) {
        float f = p0.getFloat(p1, p2);
        updateConfig(p0.getChangingConfigurations());
        return f;
    }

    public final int getInt(TypedArray p0, int p1, int p2) {
        int i = p0.getInt(p1, p2);
        updateConfig(p0.getChangingConfigurations());
        return i;
    }

    public final String getString(TypedArray p0, int p1) {
        String string = p0.getString(p1);
        updateConfig(p0.getChangingConfigurations());
        return string;
    }

    public final float getDimension(TypedArray p0, int p1, float p2) {
        float dimension = p0.getDimension(p1, p2);
        updateConfig(p0.getChangingConfigurations());
        return dimension;
    }

    public final ComplexColorCompat getNamedComplexColor(TypedArray p0, Resources.Theme p1, String p2, int p3, int p4) {
        ComplexColorCompat namedComplexColor = TypedArrayUtils.getNamedComplexColor(p0, this.xmlParser, p1, p2, p3, p4);
        updateConfig(p0.getChangingConfigurations());
        return namedComplexColor;
    }

    public final ColorStateList getNamedColorStateList(TypedArray p0, Resources.Theme p1, String p2, int p3) {
        ColorStateList namedColorStateList = TypedArrayUtils.getNamedColorStateList(p0, this.xmlParser, p1, p2, p3);
        updateConfig(p0.getChangingConfigurations());
        return namedColorStateList;
    }

    public static /* synthetic */ AndroidVectorParser copy$default(AndroidVectorParser androidVectorParser, XmlPullParser xmlPullParser, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            xmlPullParser = androidVectorParser.xmlParser;
        }
        if ((i2 & 2) != 0) {
            i = androidVectorParser.config;
        }
        return androidVectorParser.copy(xmlPullParser, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final XmlPullParser getXmlParser() {
        return this.xmlParser;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getConfig() {
        return this.config;
    }

    public final AndroidVectorParser copy(XmlPullParser p0, int p1) {
        return new AndroidVectorParser(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof AndroidVectorParser)) {
            return false;
        }
        AndroidVectorParser androidVectorParser = (AndroidVectorParser) p0;
        return Intrinsics.areEqual(this.xmlParser, androidVectorParser.xmlParser) && this.config == androidVectorParser.config;
    }

    public final int hashCode() {
        return (this.xmlParser.hashCode() * 31) + Integer.hashCode(this.config);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidVectorParser(xmlParser=");
        sb.append(this.xmlParser);
        sb.append(", config=");
        sb.append(this.config);
        sb.append(')');
        return sb.toString();
    }
}
