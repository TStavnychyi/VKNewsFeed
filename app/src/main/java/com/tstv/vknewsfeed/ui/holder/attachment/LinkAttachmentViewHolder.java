package com.tstv.vknewsfeed.ui.holder.attachment;

import android.view.View;
import android.widget.TextView;

import com.tstv.vknewsfeed.R;
import com.tstv.vknewsfeed.common.utils.Utils;
import com.tstv.vknewsfeed.model.view.attachment.LinkAttachmentViewModel;
import com.tstv.vknewsfeed.ui.holder.BaseViewHolder;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by tstv on 20.09.2017.
 */


public class LinkAttachmentViewHolder extends BaseViewHolder<LinkAttachmentViewModel> {

    @BindView(R.id.tv_title)
    public TextView title;

    @BindView(R.id.tv_attachment_url)
    public TextView url;

    public LinkAttachmentViewHolder(View itemView) {
        super(itemView);

        ButterKnife.bind(this, itemView);
    }

    @Override
    public void bindViewHolder(LinkAttachmentViewModel linkAttachmentViewModel) {
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Utils.openUrlInActionView(linkAttachmentViewModel.getUrl(), view.getContext());
            }
        });
        title.setText(linkAttachmentViewModel.getTitle());
        url.setText(linkAttachmentViewModel.getUrl());
    }

    @Override
    public void unbindViewHolder() {
        itemView.setOnClickListener(null);
        title.setText(null);
        title.setText(null);
    }
}

