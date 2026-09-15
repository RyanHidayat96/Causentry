package com.google.mlkit.vision.common.internal;

import android.content.Context;
import android.widget.Toast;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.libraries.places.internal.zztd;
import com.google.mlkit.common.internal.model.ModelUtils;
import com.google.mlkit.common.model.LocalModel;
import com.google.mlkit.common.sdkinternal.Constants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.codec.binary.Hex;

/* JADX INFO: loaded from: classes6.dex */
public class AutoMLModelUtils {
    public static String[] getModelAndLabelFilePaths(Context context, LocalModel localModel, boolean z) throws Throwable {
        String string;
        String string2 = z ? (String) Preconditions.checkNotNull(localModel.getAssetFilePath()) : (String) Preconditions.checkNotNull(localModel.getAbsoluteFilePath());
        if (localModel.isManifestFile()) {
            ModelUtils.AutoMLManifest manifestFile = ModelUtils.parseManifestFile(string2, z, context);
            if (manifestFile == null) {
                throw new IOException("Failed to parse manifest file.");
            }
            Preconditions.checkState(Constants.AUTOML_IMAGE_LABELING_MODEL_TYPE.equals(manifestFile.getModelType()), "Model type should be: %s.", Constants.AUTOML_IMAGE_LABELING_MODEL_TYPE);
            string2 = new File(new File(string2).getParent(), manifestFile.getModelFile()).toString();
            string = new File(new File(string2).getParent(), manifestFile.getLabelsFile()).toString();
        } else {
            string = "";
        }
        return new String[]{string2, string};
    }

    public static List<String> readLabelsFile(Context context, String str, boolean z) throws IOException {
        InputStream fileInputStream;
        ArrayList arrayList = new ArrayList();
        if (z) {
            int length = str != null ? str.length() : 0;
            if (zztd.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new ArrayList()) != 0) {
                Toast.makeText((Context) null, length / (((length - 1) * length) % 2), 0).show();
            }
            fileInputStream = context.getAssets().open(str);
        } else {
            fileInputStream = new FileInputStream(new File(str));
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream, Hex.DEFAULT_CHARSET_NAME));
            for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                arrayList.add(line);
            }
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            return arrayList;
        } catch (Throwable th) {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    } catch (Exception unused) {
                    }
                }
            }
            throw th;
        }
    }

    private AutoMLModelUtils() {
    }
}
