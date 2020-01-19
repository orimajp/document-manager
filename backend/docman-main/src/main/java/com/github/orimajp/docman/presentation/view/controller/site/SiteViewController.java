package com.github.orimajp.docman.presentation.view.controller.site;

import com.github.orimajp.docman.application.query.service.site.SiteQueryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * サイト表示コントローラ
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("v1/view/sites")
public class SiteViewController {

    private final SiteQueryService siteQueryService;

    // チーム一覧
    // 全ドキュメント一覧

    @GetMapping
    public ResponseEntity<Object> getSiteData() {
        return ResponseEntity.noContent().build();
    }

}
