package airbnbclone.backend.booking.mapper;

import airbnbclone.backend.booking.application.dto.BookedDateDTO;
import airbnbclone.backend.booking.application.dto.NewBookingDTO;
import airbnbclone.backend.booking.domain.Booking;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookingMapper {

    Booking newBookingToBooking(NewBookingDTO newBookingDTO);

    BookedDateDTO bookingToCheckAvailability(Booking booking);
}
