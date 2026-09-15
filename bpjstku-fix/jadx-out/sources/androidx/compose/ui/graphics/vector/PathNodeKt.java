package androidx.compose.ui.graphics.vector;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0010\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b%\u001a;\u0010\n\u001a\u00020\t*\u00020\u00002\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\\\u0010\u0011\u001a\u00020\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072$\b\u0004\u0010\u0010\u001a\u001e\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u000f\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\u000f\u0012\u0004\u0012\u00020\u00020\u000eH\u0082\b¢\u0006\u0004\b\u0011\u0010\u0012\u001a-\u0010\u0013\u001a\u00020\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a-\u0010\u0015\u001a\u00020\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0015\u0010\u0014\"\u0014\u0010\u0016\u001a\u00020\u00008\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\"\u0014\u0010\u0018\u001a\u00020\u00008\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017\"\u0014\u0010\u0019\u001a\u00020\u00008\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017\"\u0014\u0010\u001a\u001a\u00020\u00008\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0017\"\u0014\u0010\u001b\u001a\u00020\u00008\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017\"\u0014\u0010\u001c\u001a\u00020\u00008\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0017\"\u0014\u0010\u001d\u001a\u00020\u00008\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0017\"\u0014\u0010\u001e\u001a\u00020\u00008\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0017\"\u0014\u0010\u001f\u001a\u00020\u00008\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0017\"\u0014\u0010 \u001a\u00020\u00008\u0002X\u0083T¢\u0006\u0006\n\u0004\b \u0010\u0017\"\u0014\u0010!\u001a\u00020\u00008\u0002X\u0083T¢\u0006\u0006\n\u0004\b!\u0010\u0017\"\u0014\u0010\"\u001a\u00020\u00008\u0002X\u0083T¢\u0006\u0006\n\u0004\b\"\u0010\u0017\"\u0014\u0010#\u001a\u00020\u00008\u0002X\u0083T¢\u0006\u0006\n\u0004\b#\u0010\u0017\"\u0014\u0010$\u001a\u00020\u00008\u0002X\u0083T¢\u0006\u0006\n\u0004\b$\u0010\u0017\"\u0014\u0010%\u001a\u00020\u00008\u0002X\u0083T¢\u0006\u0006\n\u0004\b%\u0010\u0017\"\u0014\u0010&\u001a\u00020\u00008\u0002X\u0083T¢\u0006\u0006\n\u0004\b&\u0010\u0017\"\u0014\u0010'\u001a\u00020\u00008\u0002X\u0083T¢\u0006\u0006\n\u0004\b'\u0010\u0017\"\u0014\u0010(\u001a\u00020\u00008\u0002X\u0083T¢\u0006\u0006\n\u0004\b(\u0010\u0017\"\u0014\u0010)\u001a\u00020\u00008\u0002X\u0083T¢\u0006\u0006\n\u0004\b)\u0010\u0017\"\u0014\u0010*\u001a\u00020\u00008\u0002X\u0083T¢\u0006\u0006\n\u0004\b*\u0010\u0017\"\u0014\u0010+\u001a\u00020\u00078\u0002X\u0083T¢\u0006\u0006\n\u0004\b+\u0010,\"\u0014\u0010-\u001a\u00020\u00078\u0002X\u0083T¢\u0006\u0006\n\u0004\b-\u0010,\"\u0014\u0010.\u001a\u00020\u00078\u0002X\u0083T¢\u0006\u0006\n\u0004\b.\u0010,\"\u0014\u0010/\u001a\u00020\u00078\u0002X\u0083T¢\u0006\u0006\n\u0004\b/\u0010,\"\u0014\u00100\u001a\u00020\u00078\u0002X\u0083T¢\u0006\u0006\n\u0004\b0\u0010,\"\u0014\u00101\u001a\u00020\u00078\u0002X\u0083T¢\u0006\u0006\n\u0004\b1\u0010,\"\u0014\u00102\u001a\u00020\u00078\u0002X\u0083T¢\u0006\u0006\n\u0004\b2\u0010,\"\u0014\u00103\u001a\u00020\u00078\u0002X\u0083T¢\u0006\u0006\n\u0004\b3\u0010,\"\u0014\u00104\u001a\u00020\u00078\u0002X\u0083T¢\u0006\u0006\n\u0004\b4\u0010,"}, d2 = {"", "Ljava/util/ArrayList;", "Landroidx/compose/ui/graphics/vector/PathNode;", "Lkotlin/collections/b;", "p0", "", "p1", "", "p2", "", "addPathNodes", "(CLjava/util/ArrayList;[FI)V", "", "p3", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "p4", "pathNodesFromArgs", "(Ljava/util/List;[FIILkotlin/jvm/functions/Function2;)V", "pathMoveNodeFromArgs", "(Ljava/util/List;[FI)V", "pathRelativeMoveNodeFromArgs", "RelativeCloseKey", "C", "CloseKey", "RelativeMoveToKey", "MoveToKey", "RelativeLineToKey", "LineToKey", "RelativeHorizontalToKey", "HorizontalToKey", "RelativeVerticalToKey", "VerticalToKey", "RelativeCurveToKey", "CurveToKey", "RelativeReflectiveCurveToKey", "ReflectiveCurveToKey", "RelativeQuadToKey", "QuadToKey", "RelativeReflectiveQuadToKey", "ReflectiveQuadToKey", "RelativeArcToKey", "ArcToKey", "NUM_MOVE_TO_ARGS", "I", "NUM_LINE_TO_ARGS", "NUM_HORIZONTAL_TO_ARGS", "NUM_VERTICAL_TO_ARGS", "NUM_CURVE_TO_ARGS", "NUM_REFLECTIVE_CURVE_TO_ARGS", "NUM_QUAD_TO_ARGS", "NUM_REFLECTIVE_QUAD_TO_ARGS", "NUM_ARC_TO_ARGS"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PathNodeKt {
    private static final char ArcToKey = 'A';
    private static final char CloseKey = 'Z';
    private static final char CurveToKey = 'C';
    private static final char HorizontalToKey = 'H';
    private static final char LineToKey = 'L';
    private static final char MoveToKey = 'M';
    private static final int NUM_ARC_TO_ARGS = 7;
    private static final int NUM_CURVE_TO_ARGS = 6;
    private static final int NUM_HORIZONTAL_TO_ARGS = 1;
    private static final int NUM_LINE_TO_ARGS = 2;
    private static final int NUM_MOVE_TO_ARGS = 2;
    private static final int NUM_QUAD_TO_ARGS = 4;
    private static final int NUM_REFLECTIVE_CURVE_TO_ARGS = 4;
    private static final int NUM_REFLECTIVE_QUAD_TO_ARGS = 2;
    private static final int NUM_VERTICAL_TO_ARGS = 1;
    private static final char QuadToKey = 'Q';
    private static final char ReflectiveCurveToKey = 'S';
    private static final char ReflectiveQuadToKey = 'T';
    private static final char RelativeArcToKey = 'a';
    private static final char RelativeCloseKey = 'z';
    private static final char RelativeCurveToKey = 'c';
    private static final char RelativeHorizontalToKey = 'h';
    private static final char RelativeLineToKey = 'l';
    private static final char RelativeMoveToKey = 'm';
    private static final char RelativeQuadToKey = 'q';
    private static final char RelativeReflectiveCurveToKey = 's';
    private static final char RelativeReflectiveQuadToKey = 't';
    private static final char RelativeVerticalToKey = 'v';
    private static final char VerticalToKey = 'V';

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final void addPathNodes(char c, ArrayList<PathNode> arrayList, float[] fArr, int i) {
        int i2 = 0;
        switch (c) {
            case 'A':
                for (int i3 = 0; i3 <= i - 7; i3 += 7) {
                    arrayList.add(new PathNode.ArcTo(fArr[i3], fArr[i3 + 1], fArr[i3 + 2], Float.compare(fArr[i3 + 3], 0.0f) != 0, Float.compare(fArr[i3 + 4], 0.0f) != 0, fArr[i3 + 5], fArr[i3 + 6]));
                }
                return;
            case 'C':
                while (i2 <= i - 6) {
                    arrayList.add(new PathNode.CurveTo(fArr[i2], fArr[i2 + 1], fArr[i2 + 2], fArr[i2 + 3], fArr[i2 + 4], fArr[i2 + 5]));
                    i2 += 6;
                }
                return;
            case 'H':
                while (i2 <= i - 1) {
                    arrayList.add(new PathNode.HorizontalTo(fArr[i2]));
                    i2++;
                }
                return;
            case 'L':
                while (i2 <= i - 2) {
                    arrayList.add(new PathNode.LineTo(fArr[i2], fArr[i2 + 1]));
                    i2 += 2;
                }
                return;
            case 'M':
                pathMoveNodeFromArgs(arrayList, fArr, i);
                return;
            case 'Q':
                while (i2 <= i - 4) {
                    arrayList.add(new PathNode.QuadTo(fArr[i2], fArr[i2 + 1], fArr[i2 + 2], fArr[i2 + 3]));
                    i2 += 4;
                }
                return;
            case 'S':
                while (i2 <= i - 4) {
                    arrayList.add(new PathNode.ReflectiveCurveTo(fArr[i2], fArr[i2 + 1], fArr[i2 + 2], fArr[i2 + 3]));
                    i2 += 4;
                }
                return;
            case 'T':
                while (i2 <= i - 2) {
                    arrayList.add(new PathNode.ReflectiveQuadTo(fArr[i2], fArr[i2 + 1]));
                    i2 += 2;
                }
                return;
            case 'V':
                while (i2 <= i - 1) {
                    arrayList.add(new PathNode.VerticalTo(fArr[i2]));
                    i2++;
                }
                return;
            case 'Z':
            case 'z':
                arrayList.add(PathNode.Close.INSTANCE);
                return;
            case 'a':
                for (int i4 = 0; i4 <= i - 7; i4 += 7) {
                    arrayList.add(new PathNode.RelativeArcTo(fArr[i4], fArr[i4 + 1], fArr[i4 + 2], Float.compare(fArr[i4 + 3], 0.0f) != 0, Float.compare(fArr[i4 + 4], 0.0f) != 0, fArr[i4 + 5], fArr[i4 + 6]));
                }
                return;
            case 'c':
                while (i2 <= i - 6) {
                    arrayList.add(new PathNode.RelativeCurveTo(fArr[i2], fArr[i2 + 1], fArr[i2 + 2], fArr[i2 + 3], fArr[i2 + 4], fArr[i2 + 5]));
                    i2 += 6;
                }
                return;
            case 'h':
                while (i2 <= i - 1) {
                    arrayList.add(new PathNode.RelativeHorizontalTo(fArr[i2]));
                    i2++;
                }
                return;
            case 'l':
                while (i2 <= i - 2) {
                    arrayList.add(new PathNode.RelativeLineTo(fArr[i2], fArr[i2 + 1]));
                    i2 += 2;
                }
                return;
            case 'm':
                pathRelativeMoveNodeFromArgs(arrayList, fArr, i);
                return;
            case 'q':
                while (i2 <= i - 4) {
                    arrayList.add(new PathNode.RelativeQuadTo(fArr[i2], fArr[i2 + 1], fArr[i2 + 2], fArr[i2 + 3]));
                    i2 += 4;
                }
                return;
            case 's':
                while (i2 <= i - 4) {
                    arrayList.add(new PathNode.RelativeReflectiveCurveTo(fArr[i2], fArr[i2 + 1], fArr[i2 + 2], fArr[i2 + 3]));
                    i2 += 4;
                }
                return;
            case 't':
                while (i2 <= i - 2) {
                    arrayList.add(new PathNode.RelativeReflectiveQuadTo(fArr[i2], fArr[i2 + 1]));
                    i2 += 2;
                }
                return;
            case 'v':
                while (i2 <= i - 1) {
                    arrayList.add(new PathNode.RelativeVerticalTo(fArr[i2]));
                    i2++;
                }
                return;
            default:
                throw new IllegalArgumentException("Unknown command for: ".concat(String.valueOf(c)));
        }
    }

    private static final void pathNodesFromArgs(List<PathNode> list, float[] fArr, int i, int i2, Function2<? super float[], ? super Integer, ? extends PathNode> function2) {
        int i3 = 0;
        while (i3 <= i - i2) {
            list.add(function2.invoke(fArr, Integer.valueOf(i3)));
            i3 += i2;
        }
    }

    private static final void pathMoveNodeFromArgs(List<PathNode> list, float[] fArr, int i) {
        int i2 = i - 2;
        if (i2 >= 0) {
            list.add(new PathNode.MoveTo(fArr[0], fArr[1]));
            for (int i3 = 2; i3 <= i2; i3 += 2) {
                list.add(new PathNode.LineTo(fArr[i3], fArr[i3 + 1]));
            }
        }
    }

    private static final void pathRelativeMoveNodeFromArgs(List<PathNode> list, float[] fArr, int i) {
        int i2 = i - 2;
        if (i2 >= 0) {
            list.add(new PathNode.RelativeMoveTo(fArr[0], fArr[1]));
            for (int i3 = 2; i3 <= i2; i3 += 2) {
                list.add(new PathNode.RelativeLineTo(fArr[i3], fArr[i3 + 1]));
            }
        }
    }
}
