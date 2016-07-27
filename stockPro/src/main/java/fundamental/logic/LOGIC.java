package fundamental.logic;

import java.util.ArrayList;

import fundamental.dto.BpsDTO;
import fundamental.dto.EnterpriseFinanceDTO;
import fundamental.dto.EpsDTO;

public interface LOGIC {
	public ArrayList<BpsDTO> bps(ArrayList<EnterpriseFinanceDTO> list);
	public ArrayList<EpsDTO> eps(ArrayList<EnterpriseFinanceDTO> list);
	
}
