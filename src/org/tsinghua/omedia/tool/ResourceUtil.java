package org.tsinghua.omedia.tool;

import org.tsinghua.omedia.OmediaApplication;

/**
 * 
 * @author xuhongfeng
 *
 */
public class ResourceUtil {
    public static String getString(int id) {
        return OmediaApplication.getInstance().getString(id);
    }
}
