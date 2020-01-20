package com.github.orimajp.docman.presentation.view.controller.asset;

import com.github.orimajp.docman.application.query.response.asset.GetAssetDataAppResponse;
import com.github.orimajp.docman.presentation.view.response.asset.GetAssetDataResponse;
import org.springframework.stereotype.Component;

@Component
public class AssetViewConvertor {

    GetAssetDataResponse createGetAssetDataResponse(GetAssetDataAppResponse getAssetDataAppResponse) {
        // TODO
        return new GetAssetDataResponse();
    }

}
