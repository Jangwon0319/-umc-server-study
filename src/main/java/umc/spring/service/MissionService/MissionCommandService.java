package umc.spring.service.MissionService;

import umc.spring.domain.Mission;
import umc.spring.web.dto.MissionRequestDTO;
import umc.spring.web.dto.StoreRequestDTO;

public interface MissionCommandService {

    Mission createMission(Long storeId, MissionRequestDTO.MissionDTO request);
}
