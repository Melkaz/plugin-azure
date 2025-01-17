package io.kestra.plugin.azure.storage.blob.abstracts;

import io.kestra.core.models.annotations.PluginProperty;
import io.kestra.plugin.azure.storage.blob.Copy;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.constraints.NotNull;

public interface ActionInterface {
    @Schema(
        title = "The action to do on find files"
    )
    @PluginProperty(dynamic = true)
    @NotNull
    ActionInterface.Action getAction();

    @Schema(
        title = "The destination container and key."
    )
    @PluginProperty(dynamic = true)
    Copy.CopyObject getMoveTo();

    enum Action {
        MOVE,
        DELETE
    }
}
