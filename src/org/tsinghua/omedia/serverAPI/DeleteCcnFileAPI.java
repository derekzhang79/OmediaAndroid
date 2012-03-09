package org.tsinghua.omedia.serverAPI;

import org.tsinghua.omedia.activity.OmediaActivityIntf;
import org.tsinghua.omedia.consts.ResultCode;
import org.tsinghua.omedia.consts.UrlConst;
import org.tsinghua.omedia.data.EmptyInstance;
import org.tsinghua.omedia.data.EmptyInstance.EmptyResultType;
import org.tsinghua.omedia.form.DeleteCcnFileForm;

/**
 * 
 * @author xuhongfeng
 *
 */
public abstract class DeleteCcnFileAPI extends AbstractServerAPI<DeleteCcnFileForm>{

    protected DeleteCcnFileAPI(DeleteCcnFileForm form,
            OmediaActivityIntf omediaActivity) {
        super(form, omediaActivity);
    }

    @Override
    protected String getUrl() {
        return UrlConst.ccnDeleteFileUrl;
    }

    @Override
    protected void initResultCodeListener() {
        registerResultCodeListener(ResultCode.SUCCESS,
                new ResultCodeListener<EmptyInstance.EmptyResultType>(EmptyResultType.class) {

                    @Override
                    protected void innerRun(EmptyResultType result) {
                        onSuccess();
                    }
                });
    }

    protected abstract void onSuccess();
}
