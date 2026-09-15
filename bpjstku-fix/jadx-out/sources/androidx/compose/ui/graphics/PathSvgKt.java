package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.vector.PathParser;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\u0007\u001a\u00020\u0001*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u001f\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/compose/ui/graphics/Path;", "", "p0", "", "addSvg", "(Landroidx/compose/ui/graphics/Path;Ljava/lang/String;)V", "", "toSvg", "(Landroidx/compose/ui/graphics/Path;Z)Ljava/lang/String;", "Landroidx/compose/ui/graphics/PathSegment$Type;", "p1", "command", "(Landroidx/compose/ui/graphics/PathSegment$Type;Landroidx/compose/ui/graphics/PathSegment$Type;)Ljava/lang/String;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PathSvgKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PathSegment.Type.values().length];
            try {
                iArr[PathSegment.Type.Move.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PathSegment.Type.Line.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PathSegment.Type.Quadratic.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PathSegment.Type.Conic.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PathSegment.Type.Cubic.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PathSegment.Type.Close.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PathSegment.Type.Done.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void addSvg(Path path, String str) {
        new PathParser().parsePathString(str).toPath(path);
    }

    public static final String toSvg(Path path, boolean z) {
        StringBuilder sb = new StringBuilder();
        Rect bounds = path.getBounds();
        if (z) {
            sb.append("<svg xmlns=\"http://www.w3.org/2000/svg\" ");
            StringBuilder sb2 = new StringBuilder("viewBox=\"");
            sb2.append(bounds.getLeft());
            sb2.append(' ');
            sb2.append(bounds.getTop());
            sb2.append(' ');
            sb2.append(bounds.getRight() - bounds.getLeft());
            sb2.append(' ');
            sb2.append(bounds.getBottom() - bounds.getTop());
            sb2.append("\">");
            sb.append(sb2.toString());
            Intrinsics.checkNotNullExpressionValue(sb, "");
            sb.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb, "");
        }
        PathIterator it = path.iterator();
        float[] fArr = new float[8];
        PathSegment.Type type = PathSegment.Type.Done;
        if (it.hasNext()) {
            if (z) {
                if (PathFillType.m4509equalsimpl0(path.mo4107getFillTypeRgk1Os(), PathFillType.INSTANCE.m4513getEvenOddRgk1Os())) {
                    sb.append("  <path fill-rule=\"evenodd\" d=\"");
                } else {
                    sb.append("  <path d=\"");
                }
            }
            while (it.hasNext()) {
                PathSegment.Type typeNext$default = PathIterator.next$default(it, fArr, 0, 2, null);
                switch (WhenMappings.$EnumSwitchMapping$0[typeNext$default.ordinal()]) {
                    case 1:
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(command(PathSegment.Type.Move, type));
                        sb3.append(fArr[0]);
                        sb3.append(' ');
                        sb3.append(fArr[1]);
                        sb.append(sb3.toString());
                        type = typeNext$default;
                        break;
                    case 2:
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(command(PathSegment.Type.Line, type));
                        sb4.append(fArr[2]);
                        sb4.append(' ');
                        sb4.append(fArr[3]);
                        sb.append(sb4.toString());
                        type = typeNext$default;
                        break;
                    case 3:
                        sb.append(command(PathSegment.Type.Quadratic, type));
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(fArr[2]);
                        sb5.append(' ');
                        sb5.append(fArr[3]);
                        sb5.append(' ');
                        sb5.append(fArr[4]);
                        sb5.append(' ');
                        sb5.append(fArr[5]);
                        sb.append(sb5.toString());
                        type = typeNext$default;
                        break;
                    case 4:
                    case 7:
                        break;
                    case 5:
                        sb.append(command(PathSegment.Type.Cubic, type));
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append(fArr[2]);
                        sb6.append(' ');
                        sb6.append(fArr[3]);
                        sb6.append(' ');
                        sb.append(sb6.toString());
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append(fArr[4]);
                        sb7.append(' ');
                        sb7.append(fArr[5]);
                        sb7.append(' ');
                        sb.append(sb7.toString());
                        StringBuilder sb8 = new StringBuilder();
                        sb8.append(fArr[6]);
                        sb8.append(' ');
                        sb8.append(fArr[7]);
                        sb.append(sb8.toString());
                        type = typeNext$default;
                        break;
                    case 6:
                        sb.append(command(PathSegment.Type.Close, type));
                        type = typeNext$default;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
            if (z) {
                sb.append("\"/>");
                Intrinsics.checkNotNullExpressionValue(sb, "");
                sb.append('\n');
                Intrinsics.checkNotNullExpressionValue(sb, "");
            }
        }
        if (z) {
            sb.append("</svg>");
            Intrinsics.checkNotNullExpressionValue(sb, "");
            sb.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb, "");
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static /* synthetic */ String toSvg$default(Path path, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return toSvg(path, z);
    }

    private static final String command(PathSegment.Type type, PathSegment.Type type2) {
        if (type != type2) {
            int i = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
            if (i == 1) {
                return "M";
            }
            if (i == 2) {
                return "L";
            }
            if (i == 3) {
                return "Q";
            }
            if (i == 5) {
                return "C";
            }
            if (i == 6) {
                return "Z";
            }
            return "";
        }
        return " ";
    }
}
