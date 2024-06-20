package umc.spring.web.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;

public class MissionRequestDTO {

    @Getter
    public static class MissionDTO{
        @NotBlank
        String missionSpec;

        @NotNull
        Integer reward;
    }
}
