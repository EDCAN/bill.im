package kr.edcan.billim;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/**
 * Created by Junseok on 2015-04-16.
 */
public class CData {
    private int icon, value_id;
    private String confirm;
    private String content_label;
    private String description;

    public CData(Context context, int icon_,  String content_label_, String description_, String confirm_, int value_id_) {
        icon = icon_;
        confirm = confirm_;
        content_label = content_label_;
        description = description_;
        value_id = value_id_;
    }

    public int getValue_id() {return value_id;}
    public int getIcon() {
        return icon;
    }
    public String getConfirm() {
        return confirm;
    }
    public String getContent_label() {
        return content_label;
    }
    public String getDescription() {
        return description;
    }
}